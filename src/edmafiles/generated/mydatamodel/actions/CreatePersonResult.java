package edmafiles.generated.mydatamodel.actions;

import edmafiles.generated.valuedomains.mydatamodel.PersonID;
import org.abstractica.edma.runtime.intf.IResult;

/**
 * Access to the result of the method: createPerson
 */
public interface CreatePersonResult extends IResult
{

    /**
     * Returns the output id:PersonID
     * @return  The output id:PersonID
     */
    public PersonID getId();

}
