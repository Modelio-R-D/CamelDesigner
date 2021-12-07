/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v0.0.10

 * This file was generated on 7/24/20 11:19 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.constraintmodel.standard.class_;

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
@objid ("9b1c2428-a71a-4f15-ae75-45a69c917345")
public abstract class UnaryConstraint extends Constraint {
    @objid ("4c575b19-436e-4e5f-9c42-8bb2fbae3aa3")
    public static final String STEREOTYPE_NAME = "UnaryConstraint";

    @objid ("2030d764-0a8e-42da-acd5-cdc7d9da12b4")
    public static final String COMPARISONOPERATOR_TAGTYPE = "comparisonOperator";

    @objid ("22c9cf73-6ca9-458b-a232-0a87f0d9b02c")
    public static final String THRESHOLD_TAGTYPE = "threshold";

    @objid ("c5635199-4fe6-4e94-813d-a9f1cdb8046a")
    public static final String VALIDITY_TAGTYPE = "validity";

    @objid ("4fb6b15b-6ad6-47d4-acd8-c390bbe3232b")
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
    @objid ("34201cac-73e6-416d-936f-2d2dcd10f4e3")
    public String getComparisonOperator() {
        return this.elt.getTagValue(UnaryConstraint.MdaTypes.COMPARISONOPERATOR_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("97bc17ba-cd1f-4646-b3e1-565e4d84c734")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'threshold'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3727a989-0f22-4120-ab02-7e318005c4fe")
    public String getThreshold() {
        return this.elt.getTagValue(UnaryConstraint.MdaTypes.THRESHOLD_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'validity'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9dc41709-72a0-4cae-a465-4097c184b6c3")
    public String getValidity() {
        return this.elt.getTagValue(UnaryConstraint.MdaTypes.VALIDITY_TAGTYPE_ELT);
    }

    @objid ("9c981a1c-3e7d-4c75-a43f-9bcc7803cbd6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'comparisonOperator'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a3d1e714-e1f6-43ee-9953-f6425d952f3f")
    public void setComparisonOperator(final String value) {
        this.elt.putTagValue(UnaryConstraint.MdaTypes.COMPARISONOPERATOR_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'threshold'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("18b2e810-dea5-4225-8bec-51e28a3ad179")
    public void setThreshold(final String value) {
        this.elt.putTagValue(UnaryConstraint.MdaTypes.THRESHOLD_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'validity'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("85d2a406-4ecd-4505-8bd3-563345b27570")
    public void setValidity(final String value) {
        this.elt.putTagValue(UnaryConstraint.MdaTypes.VALIDITY_TAGTYPE_ELT, value);
    }

    @objid ("59afd3bc-e7a5-4d8f-b419-d9c55f85710d")
    protected UnaryConstraint(final Class elt) {
        super(elt);
    }

    @objid ("28dfcd99-9872-4b5e-ad80-f9a69de79e78")
    public static final class MdaTypes {
        @objid ("81c64c88-9f62-4587-b0ea-6fbdf4d53eaa")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("345fc1fd-815a-4be4-9f84-6a1edf4a08c0")
        public static TagType VALIDITY_TAGTYPE_ELT;

        @objid ("b5233215-479c-495f-9771-c422ea207945")
        public static TagType COMPARISONOPERATOR_TAGTYPE_ELT;

        @objid ("6612e12e-c51b-4688-ad04-f62042cec6bb")
        public static TagType THRESHOLD_TAGTYPE_ELT;

        @objid ("229034db-08fd-4ba8-bd3c-5292d6dc3578")
        private static Stereotype MDAASSOCDEP;

        @objid ("e461ecef-51d9-4ddc-a922-514db953c33a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e4c4e5af-6197-44da-95c0-d8b0401fa2e4")
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
