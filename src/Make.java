import org.abstractica.edma.generator.EdmaGenerator;

public class Make {
    public static void main(String[] args) {
        String projectDir = "F:/learnedma";
        EdmaGenerator generator = new EdmaGenerator("learnemda", projectDir + "/edmasrc", projectDir+"/src", "edmafiles");
        generator.make();
    }
}
