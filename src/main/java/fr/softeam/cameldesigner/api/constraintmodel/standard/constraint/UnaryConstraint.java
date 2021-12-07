/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
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
    @objid ("49f1db33-f236-4da9-b4ff-aeefb1adad04")
    public static final String STEREOTYPE_NAME = "UnaryConstraint";

    @objid ("c58dd051-466a-4522-978b-afdb321d9455")
    public static final String COMPARISONOPERATOR_TAGTYPE = "comparisonOperator";

    @objid ("4e2038db-72d9-45cc-9ffb-440e57509466")
    public static final String THRESHOLD_TAGTYPE = "threshold";

    @objid ("c6da2731-5351-43b8-9c4e-247a59dc4dd8")
    public static final String VALIDITY_TAGTYPE = "validity";

    @objid ("3a59920c-b625-4b53-9868-d58340d3a5e3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && (
                (MetricConstraint.canInstantiate(elt))
                || (AttributeConstraint.canInstantiate(elt))
                || (MetricVariableConstraint.canInstantiate(elt))
                ));
    }

    @objid ("42cc5de3-7f2d-49ec-aba5-f3b07dadf8ac")
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
    @objid ("7d71acd6-1785-4513-9942-aefcf694087a")
    public String getComparisonOperator() {
        return this.elt.getTagValue(UnaryConstraint.MdaTypes.COMPARISONOPERATOR_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Constraint}.
     * 
     * @return the Constraint represented by this proxy, never null.
     */
    @objid ("ea43fc3e-a283-4402-b795-7f8dbf28c15f")
    @Override
    public Constraint getElement() {
        return (Constraint)super.getElement();
    }

    /**
     * Getter for string property 'threshold'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5db7a1c3-fa86-4cad-97ab-8ea1f4d69b17")
    public String getThreshold() {
        return this.elt.getTagValue(UnaryConstraint.MdaTypes.THRESHOLD_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'validity'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6a269959-a10b-4e98-83ed-2523d95a4759")
    public String getValidity() {
        return this.elt.getTagValue(UnaryConstraint.MdaTypes.VALIDITY_TAGTYPE_ELT);
    }

    @objid ("cbd6fdeb-f9e3-45a7-8467-e85ebe6bd85c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'comparisonOperator'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("959ca0bb-c037-4412-a774-1123f9be6861")
    public void setComparisonOperator(final String value) {
        this.elt.putTagValue(UnaryConstraint.MdaTypes.COMPARISONOPERATOR_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'threshold'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("813ff832-bace-414b-a4ed-c482eb6d2771")
    public void setThreshold(final String value) {
        this.elt.putTagValue(UnaryConstraint.MdaTypes.THRESHOLD_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'validity'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6f5daaca-66e2-4b9b-a11d-65b538663a3a")
    public void setValidity(final String value) {
        this.elt.putTagValue(UnaryConstraint.MdaTypes.VALIDITY_TAGTYPE_ELT, value);
    }

    @objid ("e443e5ee-a0d4-4d51-9716-cd4dcf122645")
    protected UnaryConstraint(final Constraint elt) {
        super(elt);
    }

    @objid ("2712bfc7-aedc-48b5-9543-3300cf21a241")
    public static final class MdaTypes {
        @objid ("a9065481-d8e4-40b4-b7c7-1301bbf399ea")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0a300ecf-342b-4986-90a4-443ad7baf8d7")
        public static TagType VALIDITY_TAGTYPE_ELT;

        @objid ("fa7adaa6-e16e-4a8c-af8f-feb01500fcee")
        public static TagType COMPARISONOPERATOR_TAGTYPE_ELT;

        @objid ("0ee36c2c-5acc-4576-9a18-bd00489606c7")
        public static TagType THRESHOLD_TAGTYPE_ELT;

        @objid ("1aabebcf-6c07-4dd5-a14d-09e1398eed9e")
        private static Stereotype MDAASSOCDEP;

        @objid ("541baef9-b9dd-43f1-8e84-ab0398f14b4b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("97f86d27-3b78-4103-9ba3-c9811af2cce3")
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
