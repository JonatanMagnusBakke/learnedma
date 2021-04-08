package edmafiles.generated.edmaimpl.models.mydatamodel;

import edmafiles.generated.edmaimpl.models.mydatamodel.TeacherSetImpl;
import edmafiles.generated.edmaimpl.models.mydatamodel.TeacherVUImpl;
import edmafiles.generated.mydatamodel.kinds.teacher.TeacherKind;
import edmafiles.generated.mydatamodel.kinds.teacher.TeacherSet;
import edmafiles.generated.mydatamodel.kinds.teacher.TeacherViewer;
import edmafiles.generated.valuedomains.mydatamodel.TeacherID;
import org.abstractica.edma.runtime.intf.IDataModelView;
import org.abstractica.edma.runtime.intf.IEntity;

/**
 * 
 */
public class TeacherKindImpl implements TeacherKind
{
    private int edma_kindIndex;
    private IDataModelView edma_dmview;



    /**
     * Constructor
     * @param edma_kindIndex  kind index
     * @param edma_dmview     Internal runtime interface
     */
    public TeacherKindImpl(int edma_kindIndex, IDataModelView edma_dmview)
    {
        this.edma_kindIndex = edma_kindIndex;
        this.edma_dmview = edma_dmview;
    }

    /**
     * Get an entity from its id.
     * @param id  The id of the entity to get
     * @return    A viewer on the entity with the given ID or null if none
     *            exists.
     */
    public TeacherViewer getFromID(TeacherID id)
    {
        IEntity res = edma_dmview.kindGetFromID(edma_kindIndex, id.value());
        if(res == null) return null;
        return new TeacherVUImpl(res, edma_dmview);
    }

    /**
     * Returns an empty set of Teacher entities.
     * @return  An empty set of Teacher entities.
     */
    public TeacherSet getEmptyTeacherSet()
    {
        int newSetID = edma_dmview.kindGetEmptySet(1);
        return new TeacherSetImpl(newSetID, edma_dmview);
    }

    /**
     * Returns the set of all Teacher entities.
     * @return  The set of all Teacher entities.
     */
    public TeacherSet getAll()
    {
        int newSetID = edma_dmview.kindGetAll(1);
        return new TeacherSetImpl(newSetID, edma_dmview);
    }
}
