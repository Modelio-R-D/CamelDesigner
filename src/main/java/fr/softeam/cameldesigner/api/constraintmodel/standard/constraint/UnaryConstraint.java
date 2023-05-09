/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/16/23 3:21 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.constraintmodel.standard.constraint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Constraint} with << UnaryConstraint >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("3892b894-18cc-4724-ac74-318af5127843")
public abstract class UnaryConstraint extends CamelConstraint {
    @objid ("c85b13ee-b447-4dc2-9d2e-d770468e77d6")
    public static final String STEREOTYPE_NAME = "UnaryConstraint";

    @objid ("21af7a19-9cd4-4ed2-9dc6-880f77560706")
    public static final String COMPARISONOPERATOR_TAGTYPE = "comparisonOperator";

    @objid ("f1717227-49d4-47ad-acb0-dba736e3551a")
    public static final String THRESHOLD_TAGTYPE = "threshold";

    @objid ("a897bc14-fcdb-4721-8f15-a76d5353e6ef")
    public static final String VALIDITY_TAGTYPE = "validity";

    /**
     * Tells whether a {@link UnaryConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << UnaryConstraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a9c71027-63c8-49ca-9ec5-fa091427d1bc")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, UnaryConstraint.STEREOTYPE_NAME));
    }

    @objid ("ac347b10-fb7a-42f6-b214-eee3cf8b7f76")
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
    @objid ("1e5c721e-9b66-43cf-9599-b93a071bd535")
    public String getComparisonOperator() {
        return this.elt.getTagValue(UnaryConstraint.MdaTypes.COMPARISONOPERATOR_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Constraint}. 
     * @return the Constraint represented by this proxy, never null.
     */
    @objid ("8dc1d09b-76f9-4adc-98dd-3dda075c9f47")
    @Override
    public Constraint getElement() {
        return (Constraint)super.getElement();
    }

    /**
     * Getter for string property 'threshold'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("57e22525-3e36-4e5b-8447-3c46f85de181")
    public String getThreshold() {
        return this.elt.getTagValue(UnaryConstraint.MdaTypes.THRESHOLD_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'validity'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7e08402e-40aa-4ad4-91d6-56abe59d1c30")
    public String getValidity() {
        return this.elt.getTagValue(UnaryConstraint.MdaTypes.VALIDITY_TAGTYPE_ELT);
    }

    @objid ("4ed76d8c-a992-4630-a9ae-1191a338edcb")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'comparisonOperator'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a6515da3-652d-40cd-b09e-5fda8b10e3c2")
    public void setComparisonOperator(final String value) {
        this.elt.putTagValue(UnaryConstraint.MdaTypes.COMPARISONOPERATOR_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'threshold'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("24ee1ea3-7069-475a-8f3f-23b9485d2cff")
    public void setThreshold(final String value) {
        this.elt.putTagValue(UnaryConstraint.MdaTypes.THRESHOLD_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'validity'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d6b71b09-79ed-48c4-a5d9-bc46952cc450")
    public void setValidity(final String value) {
        this.elt.putTagValue(UnaryConstraint.MdaTypes.VALIDITY_TAGTYPE_ELT, value);
    }

    @objid ("66a64d62-b507-47b9-8ff8-dab14db3de27")
    protected UnaryConstraint(final Constraint elt) {
        super(elt);
    }

    @objid ("2712bfc7-aedc-48b5-9543-3300cf21a241")
    public static final class MdaTypes {
        @objid ("b0f67fdd-0b97-430f-bcdf-2f42a45b780b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("83eb201f-e6cf-4f24-86fd-44d608e58635")
        public static TagType VALIDITY_TAGTYPE_ELT;

        @objid ("4553e2f6-9628-4c1c-82b5-cff55718aabf")
        public static TagType COMPARISONOPERATOR_TAGTYPE_ELT;

        @objid ("ffd6419a-dd22-4ae4-b94b-e4c6c94b807d")
        public static TagType THRESHOLD_TAGTYPE_ELT;

        @objid ("645abd99-600a-4949-9193-183587082b21")
        private static Stereotype MDAASSOCDEP;

        @objid ("82657748-436f-49f8-aca4-317ee42394d8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("824b0184-eb22-4acb-93da-7a440a7cd517")
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
