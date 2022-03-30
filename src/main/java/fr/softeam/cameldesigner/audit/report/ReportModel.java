package fr.softeam.cameldesigner.audit.report;

import java.util.Set;
import java.util.TreeSet;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * This class represents the report model of INTOCPS Checker
 * @author ebrosse
 */
@objid ("3878a543-53ff-454c-8321-2a31bc55d370")
public class ReportModel implements IReportWriter {
    @objid ("17e68ab0-427d-4d36-8987-4e9bc2d44985")
    private Set<ElementMessage> errors;

    @objid ("f83db1c6-9d7d-4f85-9ce7-1f229585f296")
    private Set<ElementMessage> warnings;

    @objid ("8d29c0a9-dc68-41f3-8505-faa244e81d79")
    private Set<ElementMessage> infos;

    /**
     * This default constructor initializes the lists of message (errors, warning and infos)
     */
    @objid ("9adcd4f9-0e27-4cda-9b5c-f99889db9b34")
    public ReportModel() {
        this.errors = new TreeSet <> ();
        this.warnings = new TreeSet <> ();
        this.infos = new TreeSet <> ();
    }

    @objid ("18ae733e-955b-4f9e-9c25-a97370a9253a")
    @Override
    public void addWarning(final String initialMessage, MObject element, String description) {
        String message = initialMessage;
        if (message == null) {
            message = "";
        }
        
        this.warnings.add (new ElementMessage (message, element, description));
    }

    @objid ("8d1f83a8-332b-472e-992b-1fbb08948ae5")
    @Override
    public void addError(final String initialMessage, MObject element, String description) {
        String message = initialMessage;
        if (message == null) {
            message = "";
        }
        
        this.errors.add (new ElementMessage (message, element, description));
    }

    /**
     * This method returns the list of error message
     * 
     * @return set of error message
     */
    @objid ("c3fe55a9-a270-45d9-b95d-a2bab119aec3")
    public Set<ElementMessage> getErrors() {
        return this.errors;
    }

    /**
     * This method returns the list of warning message
     * 
     * @return set of warning message
     */
    @objid ("05fe3a6d-e974-4dfd-8a62-64805ab96211")
    public Set<ElementMessage> getWarnings() {
        return this.warnings;
    }

    @objid ("97f735b4-ac55-4e02-a6de-1ba905862f56")
    @Override
    public boolean isEmpty() {
        return !(hasErrors () || hasWarnings () || hasInfos ());
    }

    /**
     * Adds a warning message at the existing list
     * 
     * @param message : the text of the message
     * @param element : the Element
     */
    @objid ("1b488810-37fa-4893-a558-ac8188f6a23c")
    public void addWarning(final String message, final Element element) {
        this.warnings.add (new ElementMessage (message, element, ""));
    }

    /**
     * Adds an error message at the existing list
     * 
     * @param message : the text of the message
     * @param element : the Element
     */
    @objid ("676b8a94-3baf-454b-b931-296531eaaded")
    public void addError(String message, Element element) {
        this.errors.add (new ElementMessage (message, element, ""));
    }

    @objid ("ff108441-dc0e-4a07-ae5f-63432b6b41c8")
    @Override
    public void addInfo(String message, MObject element, String description) {
        this.infos.add(new ElementMessage (message, element, description));
    }

    /**
     * Adds an info message at the existing list
     * 
     * @param message : the text of the message
     * @param element : the Element
     */
    @objid ("0fc4dda0-b40d-47a2-a04a-f4a79ad4031f")
    public void addInfo(String message, Element element) {
        this.infos.add (new ElementMessage (message, element, ""));
    }

    /**
     * This method returns the list of info message
     * 
     * @return set of info message
     */
    @objid ("e5fef3d9-baa2-45cb-a1b1-dcc007cc1a19")
    public Set<ElementMessage> getInfos() {
        return this.infos;
    }

    @objid ("08365ad9-3317-444b-83d9-f37235293cf5")
    @Override
    public boolean hasErrors() {
        return !this.errors.isEmpty ();
    }

    @objid ("5092cbcf-69f3-45a6-9444-1eef13c6c51e")
    @Override
    public boolean hasInfos() {
        return !this.infos.isEmpty ();
    }

    @objid ("4ad94e96-24f4-48f2-9968-71195023f91b")
    @Override
    public boolean hasWarnings() {
        return !this.warnings.isEmpty ();
    }

    @objid ("215f6f15-bf16-4a1d-8cce-be809f3e398f")
    class ElementMessage implements Comparable<ElementMessage> {
        @objid ("6e85ae3b-5619-47f1-b38a-d0752a659fa7")
        public String ruleID;

        @objid ("5babfbc6-0c6e-4962-957f-318cf58fba49")
        public String description;

        @objid ("5fc2c9d5-6ad9-48f6-a64c-528c6c17f15d")
        public MObject element;

        @objid ("586bfe92-5e51-40aa-96ed-230f7542b235")
        ElementMessage(final String ruleID, final MObject element, final String description) {
            this.ruleID = ruleID;
            this.element = element;
            this.description = description;
        }

        @objid ("d9cc35c9-733e-40d9-8f22-107b372ee102")
        @Override
        public boolean equals(final Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            ElementMessage other = (ElementMessage) obj;
            if (!getOuterType().equals(other.getOuterType()))
                return false;
            if (this.description == null) {
                if (other.description != null)
                    return false;
            } else if (!this.description.equals(other.description))
                return false;
            if (this.element == null) {
                if (other.element != null)
                    return false;
            } else if (!this.element.equals(other.element))
                return false;
            if (this.ruleID == null) {
                if (other.ruleID != null)
                    return false;
            } else if (!this.ruleID.equals(other.ruleID))
                return false;
            return true;
        }

        @objid ("772fdde3-3ba6-4e07-95af-cc32886b7584")
        @Override
        public int compareTo(final ElementMessage anotherMessage) {
            if (this.element.equals(anotherMessage.element))
                return this.ruleID.compareTo(anotherMessage.ruleID) ;
            else
                return 1;
        }

        @objid ("b1927ea5-f520-4641-a8dc-da881be3aea4")
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + getOuterType().hashCode();
            result = prime * result + ((this.description == null) ? 0 : this.description.hashCode());
            result = prime * result + ((this.element == null) ? 0 : this.element.hashCode());
            result = prime * result + ((this.ruleID == null) ? 0 : this.ruleID.hashCode());
            return result;
        }

        @objid ("32263ac5-ce7d-4dd2-89e3-577ef1deff20")
        private ReportModel getOuterType() {
            return ReportModel.this;
        }

    }

}
