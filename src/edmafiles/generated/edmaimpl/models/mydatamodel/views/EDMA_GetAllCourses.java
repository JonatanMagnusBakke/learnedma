package edmafiles.generated.edmaimpl.models.mydatamodel.views;

import edmafiles.generated.edmaimpl.models.mydatamodel.MyDataModelVUImpl;
import edmafiles.usercode.models.mydatamodel.views.GetAllCoursesUserImpl;
import org.abstractica.edma.runtime.implementations.common.AView;
import org.abstractica.edma.runtime.intf.IDataModelView;
import org.abstractica.edma.runtime.intf.IView;

/**
 * 
 */
public class EDMA_GetAllCourses extends AView implements IView
{
    private GetAllCoursesUserImpl edma_userMethod;



    /**
     * Constructor
     * @param edma_userMethod  User provided method implementation
     */
    public EDMA_GetAllCourses(GetAllCoursesUserImpl edma_userMethod)
    {
        super("getAllCourses");
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
            default:
                throw new RuntimeException("Error in getAllCourses: Invalid error code: " + e);
        }
        if(e == 0)
        {
            if(edma_userMethod.getCourseList() == null)
            {
                throw new RuntimeException("Error in getAllCourses: Output parameter courseList is null");
            }
        }
    }

    /**
     * Returns the user method
     * @return  The user method
     */
    public GetAllCoursesUserImpl getUserMethod()
    {
        return edma_userMethod;
    }
}
