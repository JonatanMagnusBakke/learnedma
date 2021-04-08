package edmafiles.generated.valuedomains.mydatamodel.impl;

import edmafiles.generated.valuedomains.mydatamodel.Teacher;
import edmafiles.generated.valuedomains.mydatamodel.TeacherList;
import edmafiles.generated.valuedomains.mydatamodel.TeacherList.TeacherListBuilder;
import java.util.ArrayList;
import org.abstractica.edma.valuedomains.IValueInstance;

/**
 * 
 */
public class TeacherListBuilderImpl implements TeacherListBuilder
{
    private ArrayList<Object> valueList;



    /**
     * Constructor
     */
    public TeacherListBuilderImpl()
    {
        valueList = new ArrayList<Object>();
    }

    /**
     * Adds an element to the list
     * @param teacher  The element to be added to the list
     * @return         An interface to the builder for chaining method calls
     */
    public TeacherListBuilder add(Teacher teacher)
    {
        if(teacher == null) throw new NullPointerException();
        valueList.add(((IValueInstance) teacher).edma_getValue());
        return this;
    }

    /**
     * Builds the list with the added elements
     * @return  The builded list
     */
    public TeacherList end()
    {
        Object[] res = new Object[valueList.size()];
        int pos = 0;
        for(Object o : valueList)
        {
            res[pos++] = o;
        }
        return new TeacherListImpl(TeacherListImpl.edma_create(res));
    }
}
