/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v0.0.10

 * This file was generated on 7/24/20 11:19 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.constraintmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << UnaryConstraint >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
public abstract class UnaryConstraint extends Constraint {
    public static final String STEREOTYPE_NAME = "UnaryConstraint";

    public static final String COMPARISONOPERATOR_TAGTYPE = "comparisonOperator";

    public static final String THRESHOLD_TAGTYPE = "threshold";

    public static final String VALIDITY_TAGTYPE = "validity";

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
    public String getComparisonOperator() {
        return this.elt.getTagValue(UnaryConstraint.MdaTypes.COMPARISONOPERATOR_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'threshold'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public String getThreshold() {
        return this.elt.getTagValue(UnaryConstraint.MdaTypes.THRESHOLD_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'validity'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public String getValidity() {
        return this.elt.getTagValue(UnaryConstraint.MdaTypes.VALIDITY_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'comparisonOperator'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public void setComparisonOperator(final String value) {
        this.elt.putTagValue(UnaryConstraint.MdaTypes.COMPARISONOPERATOR_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'threshold'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public void setThreshold(final String value) {
        this.elt.putTagValue(UnaryConstraint.MdaTypes.THRESHOLD_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'validity'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public void setValidity(final String value) {
        this.elt.putTagValue(UnaryConstraint.MdaTypes.VALIDITY_TAGTYPE_ELT, value);
    }

    protected UnaryConstraint(final Class elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType VALIDITY_TAGTYPE_ELT;

        public static TagType COMPARISONOPERATOR_TAGTYPE_ELT;

        public static TagType THRESHOLD_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "66b562cc-a628-4f98-b693-93c84c04d0af");
            VALIDITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4c8a11f6-83bc-4543-a9f7-604787c6b184");
            COMPARISONOPERATOR_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "25e79d7e-e3b5-4b38-914d-8f71ffc26395");
            THRESHOLD_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "04100748-cda1-41da-9f67-32773322b2e4");
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
