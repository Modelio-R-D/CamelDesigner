/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/27/22 11:22 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.constraintmodel.standard.constraint;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Constraint} with << UnaryConstraint >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("3892b894-18cc-4724-ac74-318af5127843")
public abstract class UnaryConstraint extends CamelConstraint {
    @objid ("eb557a9a-1439-42fe-9e22-0e91dc53f0f3")
    public static final String STEREOTYPE_NAME = "UnaryConstraint";

    @objid ("5d98a8c3-b448-4180-aafd-47ff8f9a193b")
    public static final String COMPARISONOPERATOR_TAGTYPE = "comparisonOperator";

    @objid ("e3815848-2c53-445c-b7d0-000b1773d042")
    public static final String THRESHOLD_TAGTYPE = "threshold";

    @objid ("254ae69e-6870-4727-bc4f-964c47c0f30f")
    public static final String VALIDITY_TAGTYPE = "validity";

    /**
     * Tells whether a {@link UnaryConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << UnaryConstraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ca407e2d-bca9-4f62-b8d1-07e63cf3c107")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, UnaryConstraint.STEREOTYPE_NAME));
    }

    @objid ("0c6f7dba-f0ed-48ce-b436-5bf820651d54")
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        UnaryConstraint other = (UnaryConstraint) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'comparisonOperator'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("06fbcca3-eace-4b36-a6bf-bd472ddf6fb0")
    public String getComparisonOperator() {
        return this.elt.getTagValue(UnaryConstraint.MdaTypes.COMPARISONOPERATOR_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Constraint}.
     * 
     * @return the Constraint represented by this proxy, never null.
     */
    @objid ("f3941de7-c72c-42f8-b095-6c1d40c7e916")
    @Override
    public Constraint getElement() {
        return (Constraint)super.getElement();
    }

    /**
     * Getter for string property 'threshold'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8d863ed3-f5dd-4575-8fc9-d1316c4ddebc")
    public String getThreshold() {
        return this.elt.getTagValue(UnaryConstraint.MdaTypes.THRESHOLD_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'validity'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("20368b14-6f0a-4386-a63c-55b32bd22f9b")
    public String getValidity() {
        return this.elt.getTagValue(UnaryConstraint.MdaTypes.VALIDITY_TAGTYPE_ELT);
    }

    @objid ("418e5f41-45fd-4d61-a9cf-9accd9c0a5b2")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'comparisonOperator'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("fb5d4f8f-639e-4a78-b675-1a027a97e7b2")
    public void setComparisonOperator(final String value) {
        this.elt.putTagValue(UnaryConstraint.MdaTypes.COMPARISONOPERATOR_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'threshold'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c971ad00-7b31-45cc-bfe2-a51d88f9a9a6")
    public void setThreshold(final String value) {
        this.elt.putTagValue(UnaryConstraint.MdaTypes.THRESHOLD_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'validity'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("41e0fc4c-9040-402d-9970-f99c0e5175d5")
    public void setValidity(final String value) {
        this.elt.putTagValue(UnaryConstraint.MdaTypes.VALIDITY_TAGTYPE_ELT, value);
    }

    @objid ("6f56de20-de76-44e0-8fc3-6dd04f70282c")
    protected UnaryConstraint(final Constraint elt) {
        super(elt);
    }

    @objid ("9cd8cef9-5554-4e23-b43d-cd09d8994ff8")
    public static UnaryConstraint instantiate(final Constraint obj) {
        return MetricConstraint.canInstantiate(obj) ? MetricConstraint.instantiate(obj) :
            AttributeConstraint.canInstantiate(obj) ? AttributeConstraint.instantiate(obj) :
            MetricConstraint.canInstantiate(obj) ? MetricConstraint.instantiate(obj) : null;
    }

    @objid ("2712bfc7-aedc-48b5-9543-3300cf21a241")
    public static final class MdaTypes {
        @objid ("aa77da16-63e1-466c-bfd7-dfaa06b945f0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("44599fb7-621c-4b1f-9fc4-bb85f299f2af")
        public static TagType VALIDITY_TAGTYPE_ELT;

        @objid ("f04afb8e-f53f-4fcc-b418-ce2efbb37ec2")
        public static TagType COMPARISONOPERATOR_TAGTYPE_ELT;

        @objid ("71929611-0bb1-4e63-9910-d8e784217887")
        public static TagType THRESHOLD_TAGTYPE_ELT;

        @objid ("989bdaaf-d26f-499f-b4b9-c89373b5197a")
        private static Stereotype MDAASSOCDEP;

        @objid ("5e148cdb-bfa3-4538-a69a-912caf33c6a3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("caa4e264-172c-464c-b05d-b93884dfcb4c")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "e8928d56-f64c-4a1f-90b0-929dc78cd231");
            VALIDITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ce4ae655-ac63-4f75-acac-fc8ab479de0f");
            COMPARISONOPERATOR_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c145ec8b-ed85-4f7b-b6f7-9caf11d3a14d");
            THRESHOLD_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5a404e89-57d0-48c8-af7d-412703aed4c0");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


static {
        if(CamelDesignerModule.getInstance() != null) {
            init(CamelDesignerModule.getInstance().getModuleContext());
        }
    }
    }

}
