package edmafiles.usercode.models.mydatamodel.actions;

import edmafiles.generated.mydatamodel.MyDataModelUpdater;
import edmafiles.generated.mydatamodel.actions.CreatePersonResult;
import edmafiles.generated.mydatamodel.kinds.person.PersonViewer;
import edmafiles.generated.valuedomains.Email;
import edmafiles.generated.valuedomains.Name;
import edmafiles.generated.valuedomains.mydatamodel.PersonID;
import org.abstractica.edma.runtime.implementations.common.Result;
import org.abstractica.edma.runtime.intf.exceptions.UniqueException;

/**
 * 
 */
public class CreatePersonUserImpl extends Result implements CreatePersonResult
{
    private static final int OK = 0;
    private static final int EMAIL_ALREADY_EXISTS = 1;
    private final Name in_firstName;
    private final Name in_lastName;
    private final Email in_email;
    private PersonID out_id;



    /**
     * Constructor
     * @param in_firstName  Input parameter 1
     * @param in_lastName   Input parameter 2
     * @param in_email      Input parameter 3
     */
    public CreatePersonUserImpl(Name in_firstName, Name in_lastName, Email in_email)
    {
        this.in_firstName = in_firstName;
        this.in_lastName = in_lastName;
        this.in_email = in_email;
        out_id = null;
    }

    /**
     * Execution of the action
     * @param upd  Update interface
     * @return     Return 0 to commit or one of the error codes to roll back
     */
    public int execute(MyDataModelUpdater upd)
    {
        // Implementation of createPerson
        // Return one of the following error codes:
        // OK
        // EMAIL_ALREADY_EXISTS
        
        // If an error needs extra explanation, use: setErrorDescription("Extra info");
        
        // WARNING : Any code outside the following begin and end tags
        // will be lost when re-generation occurs.
        
        // EDMA_non-generated_code_begin
        try {
            PersonViewer newPerson = upd.newPerson().firstName(in_firstName).lastName(in_lastName).email(in_email);
            return OK;
        } catch (UniqueException e) {
            return EMAIL_ALREADY_EXISTS;
        }

        // EDMA_non-generated_code_end
    }

    /**
     * Returns the output id:PersonID
     * @return  The output id:PersonID
     */
    public PersonID getId()
    {
        if(errorCode() != 0) return null;
        return out_id;
    }
}
