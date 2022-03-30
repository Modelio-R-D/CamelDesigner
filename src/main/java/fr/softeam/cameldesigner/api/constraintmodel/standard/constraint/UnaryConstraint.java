/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.08

 * This file was generated on 3/30/22 3:18 PM by Modelio Studio.
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
    @objid ("3d1b6fbe-a2f4-4a2c-9d29-81a61557b29d")
    public static final String STEREOTYPE_NAME = "UnaryConstraint";

    @objid ("a209da0d-902a-4a74-a43f-db04b87fe4f2")
    public static final String COMPARISONOPERATOR_TAGTYPE = "comparisonOperator";

    @objid ("846c8ce5-c3d7-4f51-92f0-6cb2dac21f7d")
    public static final String THRESHOLD_TAGTYPE = "threshold";

    @objid ("ae12c5ff-2e3d-471e-be3e-a9b0b08edb1d")
    public static final String VALIDITY_TAGTYPE = "validity";

    /**
     * Tells whether a {@link UnaryConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << UnaryConstraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("5fc8f9de-0be3-4108-9463-54df855cbf5d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, UnaryConstraint.STEREOTYPE_NAME));
    }

    @objid ("cbecd218-ae1e-4232-b3a3-836fb740ff8f")
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
    @objid ("e2b97c4d-f8db-4037-8325-7e6d611cdc1d")
    public String getComparisonOperator() {
        return this.elt.getTagValue(UnaryConstraint.MdaTypes.COMPARISONOPERATOR_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Constraint}. 
     * @return the Constraint represented by this proxy, never null.
     */
    @objid ("113b2f45-c983-4943-8f03-f77493735a12")
    @Override
    public Constraint getElement() {
        return (Constraint)super.getElement();
    }

    /**
     * Getter for string property 'threshold'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("933fe5c1-2df9-4a8e-82d2-bf952a49a9b6")
    public String getThreshold() {
        return this.elt.getTagValue(UnaryConstraint.MdaTypes.THRESHOLD_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'validity'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("26fe79cd-9ebe-485b-bc64-4a9bdd636dd9")
    public String getValidity() {
        return this.elt.getTagValue(UnaryConstraint.MdaTypes.VALIDITY_TAGTYPE_ELT);
    }

    @objid ("f81beb93-a779-407e-9324-5604cbc82b1e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'comparisonOperator'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e738c4b6-affb-44aa-8121-17f0eecb0714")
    public void setComparisonOperator(final String value) {
        this.elt.putTagValue(UnaryConstraint.MdaTypes.COMPARISONOPERATOR_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'threshold'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("daf70ee6-eb8d-423a-a62f-bc0aaca01c81")
    public void setThreshold(final String value) {
        this.elt.putTagValue(UnaryConstraint.MdaTypes.THRESHOLD_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'validity'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ecfff545-4d7a-4c2d-a90c-8a632ab0e04b")
    public void setValidity(final String value) {
        this.elt.putTagValue(UnaryConstraint.MdaTypes.VALIDITY_TAGTYPE_ELT, value);
    }

    @objid ("fa653e8f-fe46-4775-bb3e-10f24420d067")
    protected UnaryConstraint(final Constraint elt) {
        super(elt);
    }

    @objid ("2712bfc7-aedc-48b5-9543-3300cf21a241")
    public static final class MdaTypes {
        @objid ("615bf608-f4da-4ec0-bea3-85790343c519")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cd72bb7d-b680-4b33-84b1-4607f994bc9b")
        public static TagType VALIDITY_TAGTYPE_ELT;

        @objid ("9dfec424-778a-479c-b681-f34b8cb237ff")
        public static TagType COMPARISONOPERATOR_TAGTYPE_ELT;

        @objid ("80e6c949-4c24-4d75-bf1f-4b52ef3a9632")
        public static TagType THRESHOLD_TAGTYPE_ELT;

        @objid ("b0ae073f-93ab-49a9-a022-85431ae1286b")
        private static Stereotype MDAASSOCDEP;

        @objid ("abb54eda-1a8e-4d22-bbb8-e4d1db601cf5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0cbce3fe-8b2e-48c4-9289-e9b865778432")
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
