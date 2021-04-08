package edmafiles.usercode.models.mydatamodel.views;

import edmafiles.generated.mydatamodel.MyDataModelViewer;
import edmafiles.generated.mydatamodel.kinds.course.CourseViewer;
import edmafiles.generated.mydatamodel.views.GetCourseStudentsResult;
import edmafiles.generated.valuedomains.mydatamodel.CourseID;
import edmafiles.generated.valuedomains.mydatamodel.PersonList;
import org.abstractica.edma.runtime.implementations.common.Result;

/**
 * 
 */
public class GetCourseStudentsUserImpl extends Result implements GetCourseStudentsResult
{
    private static final int OK = 0;
    private static final int COURSE_DOES_NOT_EXIST = 1;
    private final CourseID in_courseID;
    private PersonList out_studentList;



    /**
     * Constructor
     * @param in_courseID  Input parameter 1
     */
    public GetCourseStudentsUserImpl(CourseID in_courseID)
    {
        this.in_courseID = in_courseID;
        out_studentList = null;
    }

    /**
     * Execution of the view
     * @param view  View interface
     * @return      Return 0 if succesful or one of the error codes if not
     */
    public int execute(MyDataModelViewer view)
    {
        // Implementation of getCourseStudents
        // Return one of the following error codes:
        // OK
        // COURSE_DOES_NOT_EXIST
        
        // If an error needs extra explanation, use: setErrorDescription("Extra info");
        
        // WARNING : Any code outside the following begin and end tags
        // will be lost when re-generation occurs.
        
        // EDMA_non-generated_code_begin
        CourseViewer course = view.getCourseKind().getFromID(in_courseID);
        if(course == null)
        {
            return COURSE_DOES_NOT_EXIST;
        }
        out_studentList = course.getStudentSet().snapshot();
        return OK;
        // EDMA_non-generated_code_end
    }

    /**
     * Returns the output studentList:PersonList
     * @return  The output studentList:PersonList
     */
    public PersonList getStudentList()
    {
        if(errorCode() != 0) return null;
        return out_studentList;
    }
}
