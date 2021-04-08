package edmafiles;

import edmafiles.generated.learnemda;
import edmafiles.generated.mydatamodel.MyDataModelFactory;
import edmafiles.generated.mydatamodel.MyDataModelInstance;
import edmafiles.generated.mydatamodel.test.MyDataModelTest;
import org.abstractica.edma.runtime.implementations.common.collectionfactory.java.JavaCollectionFactory;
import org.abstractica.edma.runtime.implementations.mem.RuntimeFactory;
import org.abstractica.edma.valuedomains.userinput.SimpleTerminal;

import java.io.IOException;

public class Play {
    public static void main(String[] args) throws IOException {
        RuntimeFactory factory = new RuntimeFactory("F:/tmp", new JavaCollectionFactory());
        learnemda stuff = new learnemda(factory);
        MyDataModelFactory mdmf = stuff.getMyDataModelFactory();
        MyDataModelInstance inst = null;

        if(mdmf.exists("MyInstance"))
        {
            System.out.println("Loading instance data...");
            inst = mdmf.getInstance("MyInstance");
        }
        else
        {
            System.out.println("Creating new instance");
            inst = mdmf.newInstance("MyInstance");
        }
        inst.start();
        MyDataModelTest test = new MyDataModelTest(inst.getAPI(), new SimpleTerminal());
        test.start();
        inst.stop();
    }
}

