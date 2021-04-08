package edmafiles.generated.edmaimpl.models.mydatamodel;

import edmafiles.generated.edmaimpl.models.mydatamodel.CourseSetImpl;
import edmafiles.generated.edmaimpl.models.mydatamodel.PersonVUImpl;
import edmafiles.generated.mydatamodel.kinds.course.CourseSet;
import edmafiles.generated.mydatamodel.kinds.person.PersonViewer;
import edmafiles.generated.mydatamodel.kinds.teacher.TeacherUpdater;
import edmafiles.generated.mydatamodel.kinds.teacher.TeacherViewer;
import edmafiles.generated.valuedomains.mydatamodel.Teacher;
import edmafiles.generated.valuedomains.mydatamodel.TeacherID;
import edmafiles.generated.valuedomains.mydatamodel.impl.TeacherIDImpl;
import edmafiles.generated.valuedomains.mydatamodel.impl.TeacherImpl;
import org.abstractica.edma.runtime.intf.IDataModelView;
import org.abstractica.edma.runtime.intf.IEntity;

/**
 * 
 */
public class TeacherVUImpl implements TeacherUpdater, TeacherViewer
{
    protected IEntity edma_entity;
    private IDataModelView edma_dmview;



    /**
     * Constructor
     * @param edma_entity  Internal entity
     * @param edma_dmview  Internal runtime interface
     */
    public TeacherVUImpl(IEntity edma_entity, IDataModelView edma_dmview)
    {
        this.edma_entity = edma_entity;
        this.edma_dmview = edma_dmview;
    }

    /**
     * Create a copy of this Teacher at this instance in time
     * @return  A copy of this Teacher entity as a value  from the value domain
     *          Teacher
     */
    public Teacher snapshot()
    {
        Object[] res = new Object[1];
        Object[] internal = edma_entity.getValue();
        res[0] = internal[0];
        return new TeacherImpl(res);
    }

    /**
     * Returns the ID of this Teacher
     * @return  The ID of this Teacher
     */
    public TeacherID getID()
    {
        return new TeacherIDImpl(edma_entity.getID());
    }

    /**
     * Views this Teacher as its base kind Person. Will never return
     * <tt>null</tt> since Teacher is always an extension of Person
     * @return  The Person view of this Teacher
     */
    public PersonViewer asPerson()
    {
        IEntity base = edma_dmview.kindGetFromID(0, edma_entity.getID());
        return new PersonVUImpl(base, edma_dmview);
    }

    /**
     * This methods follows the relation TeacherAssignment
     * @return  The result of following the relation TeacherAssignment
     */
    public CourseSet getCourseSet()
    {
        int setID = edma_dmview.relationAsBGetASet(1, edma_entity.getID());
        return new CourseSetImpl(setID, edma_dmview);
    }

    /**
     * Returns <tt>true</tt> if this entity has the same ID as the provided
     * entity
     * @param o  The object to compare with
     * @return   <tt>true</tt> if this entity has the same ID as the provided
     *           entity
     */
    public boolean equals(Object o)
    {
        if(!(o instanceof TeacherViewer)) return false;
        TeacherViewer other = (TeacherViewer) o;
        return getID().equals(other.getID());
    }

    /**
     * Returns the hash code of this entity
     * @return  The hash code of this entity
     */
    public int hashCode()
    {
        return getID().hashCode();
    }
}
