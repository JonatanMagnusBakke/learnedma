package edmafiles.generated.mydatamodel.kinds.teacher;

import edmafiles.generated.mydatamodel.kinds.teacher.TeacherSet;
import edmafiles.generated.mydatamodel.kinds.teacher.TeacherViewer;
import edmafiles.generated.valuedomains.mydatamodel.TeacherID;

/**
 * Interface for the kind: Teacher
 */
public interface TeacherKind
{

    /**
     * Get an entity from its id.
     * @param id  The id of the entity to get
     * @return    A viewer on the entity with the given ID or null if none
     *            exists.
     */
    public TeacherViewer getFromID(TeacherID id);

    /**
     * Returns an empty set of Teacher entities.
     * @return  An empty set of Teacher entities.
     */
    public TeacherSet getEmptyTeacherSet();

    /**
     * Returns the set of all Teacher entities.
     * @return  The set of all Teacher entities.
     */
    public TeacherSet getAll();

}
