package edmafiles.generated.mydatamodel.remote;

import edmafiles.generated.mydatamodel.views.GetAllCoursesResult;
import edmafiles.generated.valuedomains.mydatamodel.CourseList;

/**
 * 
 */
public class RemoteGetAllCoursesResult implements GetAllCoursesResult
{
    private int edma_errorCode;
    private String edma_errorMsg;
    private String edma_errorDesc;
    private CourseList courseList;



    /**
     * Constructor
     * @param edma_errorCode  Error code
     * @param edma_errorMsg   Error message
     * @param edma_errorDesc  Error description
     * @param courseList      output parameter courseList
     */
    public RemoteGetAllCoursesResult(int edma_errorCode, String edma_errorMsg, String edma_errorDesc, CourseList courseList)
    {
        this.edma_errorCode = edma_errorCode;
        this.edma_errorMsg = edma_errorMsg;
        this.edma_errorDesc = edma_errorDesc;
        this.courseList = courseList;
    }

    /**
     * Get the error code
     * @return  
     */
    public int errorCode()
    {
        return edma_errorCode;
    }

    /**
     * Get the error message
     * @return  
     */
    public String errorMessage()
    {
        return edma_errorMsg;
    }

    /**
     * Get the error description
     * @return  
     */
    public String errorDescription()
    {
        return edma_errorDesc;
    }

    /**
     * get output parameter courseList
     * @return  The output parameter courseList
     */
    public CourseList getCourseList()
    {
        return courseList;
    }
}
