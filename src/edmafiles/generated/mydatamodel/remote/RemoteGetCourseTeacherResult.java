package edmafiles.generated.mydatamodel.remote;

import edmafiles.generated.mydatamodel.views.GetCourseTeacherResult;
import edmafiles.generated.valuedomains.mydatamodel.Teacher;

/**
 * 
 */
public class RemoteGetCourseTeacherResult implements GetCourseTeacherResult
{
    private int edma_errorCode;
    private String edma_errorMsg;
    private String edma_errorDesc;
    private Teacher teacher;



    /**
     * Constructor
     * @param edma_errorCode  Error code
     * @param edma_errorMsg   Error message
     * @param edma_errorDesc  Error description
     * @param teacher         output parameter teacher
     */
    public RemoteGetCourseTeacherResult(int edma_errorCode, String edma_errorMsg, String edma_errorDesc, Teacher teacher)
    {
        this.edma_errorCode = edma_errorCode;
        this.edma_errorMsg = edma_errorMsg;
        this.edma_errorDesc = edma_errorDesc;
        this.teacher = teacher;
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
     * get output parameter teacher
     * @return  The output parameter teacher
     */
    public Teacher getTeacher()
    {
        return teacher;
    }
}
