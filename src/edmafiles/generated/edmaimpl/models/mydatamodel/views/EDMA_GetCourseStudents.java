package edmafiles.generated.edmaimpl.models.mydatamodel.views;

import edmafiles.generated.edmaimpl.models.mydatamodel.MyDataModelVUImpl;
import edmafiles.usercode.models.mydatamodel.views.GetCourseStudentsUserImpl;
import org.abstractica.edma.runtime.implementations.common.AView;
import org.abstractica.edma.runtime.intf.IDataModelView;
import org.abstractica.edma.runtime.intf.IView;

/**
 * 
 */
public class EDMA_GetCourseStudents extends AView implements IView
{
    private GetCourseStudentsUserImpl edma_userMethod;



    /**
     * Constructor
     * @param edma_userMethod  User provided method implementation
     */
    public EDMA_GetCourseStudents(GetCourseStudentsUserImpl edma_userMethod)
    {
        super("getCourseStudents");
        this.edma_userMethod = edma_userMethod;
    }

    /**
     * Execution of the view
     * @param edma_dm  Data model view interface
     */
    public void execute(IDataModelView edma_dm)
    {
        int e = edma_userMethod.execute(new MyDataModelVUImpl(edma_dm));
        switch(e)
        {
            case 0:
                edma_userMethod.setErrorCode(0, "OK");
                break;
            case 1:
                edma_userMethod.setErrorCode(1, "Course does not exist");
                break;
            default:
                throw new RuntimeException("Error in getCourseStudents: Invalid error code: " + e);
        }
        if(e == 0)
        {
            if(edma_userMethod.getStudentList() == null)
            {
                throw new RuntimeException("Error in getCourseStudents: Output parameter studentList is null");
            }
        }
    }

    /**
     * Returns the user method
     * @return  The user method
     */
    public GetCourseStudentsUserImpl getUserMethod()
    {
        return edma_userMethod;
    }
}
