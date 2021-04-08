package edmafiles.generated.mydatamodel.kinds.teacher;


/**
 * Filter interface for the Teacher kind.
 */
public interface TeacherFilter
{

    /**
     * Returns <tt>true</tt> if the entity is accepted by the filter.
     * @param teacher  The entity to be tested by the filter.
     * @return         <tt>true</tt> if the entity is accepted by the filter.
     */
    public boolean accept(TeacherViewer teacher);

}
