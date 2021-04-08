package edmafiles.generated.valuedomains.mydatamodel.impl;

import edmafiles.generated.valuedomains.mydatamodel.Teacher;
import edmafiles.generated.valuedomains.mydatamodel.Teacher.TeacherBuilderID;
import edmafiles.generated.valuedomains.mydatamodel.TeacherID;
import edmafiles.generated.valuedomains.mydatamodel.impl.TeacherIDImpl;
import org.abstractica.edma.valuedomains.IValueInstance;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;

/**
 * 
 */
public class TeacherBuilderImpl implements TeacherBuilderID
{
    private Object[] edma_value;



    /**
     * Constructor
     */
    public TeacherBuilderImpl()
    {
        edma_value = new Object[1];
    }

    /**
     * sets the ID field.
     * @param ID  The value to assign to the ID field
     * @return    The created Teacher value
     */
    public Teacher ID(TeacherID ID)
    {
        edma_value[0] = (ID == null ? null : (((IValueInstance) ID).edma_getValue()));
        return new TeacherImpl(TeacherImpl.edma_create(edma_value));
    }

    /**
     * sets the ID field.
     * @param ID  The value to assign to the ID field
     * @return    The created Teacher value
     */
    public Teacher ID(Long ID) throws InvalidValueException
    {
        if(ID != null) TeacherIDImpl.edma_validate(ID);
        edma_value[0] = (ID == null ? null : (TeacherIDImpl.edma_create(ID)));
        return new TeacherImpl(TeacherImpl.edma_create(edma_value));
    }

    /**
     * sets the fieldID to null.
     * @return  The created Teacher value
     */
    public Teacher noID()
    {
        edma_value[0] = null;
        return new TeacherImpl(TeacherImpl.edma_create(edma_value));
    }
}
