/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/23/22 5:02 PM by Modelio Studio.
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
    @objid ("c2cfa62c-c1d1-4c08-8c57-8e11dc2888ba")
    public static final String STEREOTYPE_NAME = "UnaryConstraint";

    @objid ("df6d0866-d3b7-401b-840a-77eac9e8d13b")
    public static final String COMPARISONOPERATOR_TAGTYPE = "comparisonOperator";

    @objid ("f2c19b8b-e59b-4917-a278-76a3b335e86c")
    public static final String THRESHOLD_TAGTYPE = "threshold";

    @objid ("bbfb4687-9f42-4398-9157-1c7ca5e3751a")
    public static final String VALIDITY_TAGTYPE = "validity";

    /**
     * Tells whether a {@link UnaryConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << UnaryConstraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("06f5284f-9795-4d88-a6f7-e0618dc86d87")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, UnaryConstraint.STEREOTYPE_NAME));
    }

    @objid ("fa61c91f-608e-46b5-9d17-2d00f84be93f")
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
    @objid ("ad9d3bcb-2b3b-45a6-ae30-a88a119b8a37")
    public String getComparisonOperator() {
        return this.elt.getTagValue(UnaryConstraint.MdaTypes.COMPARISONOPERATOR_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Constraint}. 
     * @return the Constraint represented by this proxy, never null.
     */
    @objid ("35dfaec4-c601-415a-b47a-661e03f1c060")
    @Override
    public Constraint getElement() {
        return (Constraint)super.getElement();
    }

    /**
     * Getter for string property 'threshold'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("accfb551-9a6a-4ac7-baef-62d1ce9c2a84")
    public String getThreshold() {
        return this.elt.getTagValue(UnaryConstraint.MdaTypes.THRESHOLD_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'validity'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d68809e4-ca3b-4a7b-9d38-08b8bcacfce1")
    public String getValidity() {
        return this.elt.getTagValue(UnaryConstraint.MdaTypes.VALIDITY_TAGTYPE_ELT);
    }

    @objid ("1a76d6f3-4f14-4eb3-af27-443e2b993120")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'comparisonOperator'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f5608cad-26de-463c-972d-f26b97cbbf2d")
    public void setComparisonOperator(final String value) {
        this.elt.putTagValue(UnaryConstraint.MdaTypes.COMPARISONOPERATOR_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'threshold'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("226112fe-ef6d-4e7d-82de-2d9d11ba03d8")
    public void setThreshold(final String value) {
        this.elt.putTagValue(UnaryConstraint.MdaTypes.THRESHOLD_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'validity'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c424b11c-fdc9-426d-911e-9c62d7602470")
    public void setValidity(final String value) {
        this.elt.putTagValue(UnaryConstraint.MdaTypes.VALIDITY_TAGTYPE_ELT, value);
    }

    @objid ("3792a671-5913-4fc7-84e5-d6fce13eace4")
    protected UnaryConstraint(final Constraint elt) {
        super(elt);
    }

    @objid ("2712bfc7-aedc-48b5-9543-3300cf21a241")
    public static final class MdaTypes {
        @objid ("3dff13e4-4ea5-4cff-83f9-1e7da9751c48")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("29941fd1-9ef1-46e1-a013-f6a10c2f12ee")
        public static TagType VALIDITY_TAGTYPE_ELT;

        @objid ("e0f9ae4a-4407-4bf2-855d-ff1c42a3f48e")
        public static TagType COMPARISONOPERATOR_TAGTYPE_ELT;

        @objid ("0760458c-43e6-4f79-be8d-083f41913b10")
        public static TagType THRESHOLD_TAGTYPE_ELT;

        @objid ("d43bb689-0555-4fd7-90ba-74f311bf4496")
        private static Stereotype MDAASSOCDEP;

        @objid ("a86124a0-d181-495a-aab0-673d2d038471")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("66dacd52-84a8-42e0-80a6-8a1cc0a0b05b")
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
