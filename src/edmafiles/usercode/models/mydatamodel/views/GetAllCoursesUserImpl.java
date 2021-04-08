package edmafiles.usercode.models.mydatamodel.views;

import edmafiles.generated.mydatamodel.MyDataModelViewer;
import edmafiles.generated.mydatamodel.views.GetAllCoursesResult;
import edmafiles.generated.valuedomains.mydatamodel.CourseList;
import org.abstractica.edma.runtime.implementations.common.Result;

/**
 * 
 */
public class GetAllCoursesUserImpl extends Result implements GetAllCoursesResult
{
    private static final int OK = 0;
    private CourseList out_courseList;



    /**
     * Constructor
     */
    public GetAllCoursesUserImpl()
    {
        out_courseList = null;
    }

    /**
     * Execution of the view
     * @param view  View interface
     * @return      Return 0 if succesful or one of the error codes if not
     */
    public int execute(MyDataModelViewer view)
    {
        // Implementation of getAllCourses
        // Return one of the following error codes:
        // OK
        
        // If an error needs extra explanation, use: setErrorDescription("Extra info");
        
        // WARNING : Any code outside the following begin and end tags
        // will be lost when re-generation occurs.
        
        // EDMA_non-generated_code_begin
        out_courseList = view.getCourseKind().getAll().snapshot();
        return OK;
        
        // EDMA_non-generated_code_end
    }

    /**
     * Returns the output courseList:CourseList
     * @return  The output courseList:CourseList
     */
    public CourseList getCourseList()
    {
        if(errorCode() != 0) return null;
        return out_courseList;
    }
}
