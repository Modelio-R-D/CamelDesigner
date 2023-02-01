/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("9558c392-d56b-4741-b904-40119fa0ea94")
    public static final String STEREOTYPE_NAME = "UnaryConstraint";

    @objid ("7e55edb3-7ce0-465e-bccd-c785d5ee041b")
    public static final String COMPARISONOPERATOR_TAGTYPE = "comparisonOperator";

    @objid ("66321a2d-774d-4fbf-bc0c-253a4f5a1918")
    public static final String THRESHOLD_TAGTYPE = "threshold";

    @objid ("384b494a-1940-4351-b4fb-b30bcd68ee53")
=======
    @objid ("d36e81aa-d6bc-408e-aa2f-6dfad156ee34")
    public static final String STEREOTYPE_NAME = "UnaryConstraint";

    @objid ("903cb563-617f-44e9-8551-1ac1093afa3c")
    public static final String COMPARISONOPERATOR_TAGTYPE = "comparisonOperator";

    @objid ("48646669-7994-42ca-b3cb-feac3c12d5f8")
    public static final String THRESHOLD_TAGTYPE = "threshold";

    @objid ("7a924b56-52f1-45e8-9742-59104818670a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String VALIDITY_TAGTYPE = "validity";

    /**
     * Tells whether a {@link UnaryConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << UnaryConstraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("01fa4820-98d8-4b58-afad-2cfe2f612118")
=======
    @objid ("0793daed-cb87-4628-a01b-6c2ff9aa4c64")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, UnaryConstraint.STEREOTYPE_NAME));
    }

<<<<<<< HEAD
    @objid ("2a94624a-655d-406d-87bb-11cc1f93b19a")
=======
    @objid ("fb57dafc-ac19-4ac5-ac22-3bff85c9639e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("087452d1-0296-4f50-860a-55f94321c8d9")
=======
    @objid ("7e4c3ead-e7c1-4875-9ca3-3fd8733cab95")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getComparisonOperator() {
        return this.elt.getTagValue(UnaryConstraint.MdaTypes.COMPARISONOPERATOR_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Constraint}. 
     * @return the Constraint represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("775f61e4-e9df-4dbc-af37-d6917d911305")
=======
    @objid ("24436ed4-b18d-4aea-9581-3719475a4319")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Constraint getElement() {
        return (Constraint)super.getElement();
    }

    /**
     * Getter for string property 'threshold'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("0b41a117-3d04-4abb-8bac-1699d43f85a1")
=======
    @objid ("582c36d2-23ee-4379-8287-cf38ad0fa60b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getThreshold() {
        return this.elt.getTagValue(UnaryConstraint.MdaTypes.THRESHOLD_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'validity'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("02995cbd-7de3-4555-8f42-24efed7c62a4")
=======
    @objid ("a4f5d8d5-151a-4767-b8bb-7f03a15d0026")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getValidity() {
        return this.elt.getTagValue(UnaryConstraint.MdaTypes.VALIDITY_TAGTYPE_ELT);
    }

<<<<<<< HEAD
    @objid ("81675409-c97c-42dc-977d-1a83ced78551")
=======
    @objid ("574396ab-74f2-4fe5-9feb-2b545d2b8eac")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'comparisonOperator'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("9f2a3ca8-a06a-482f-b6ef-a37dd932ca7c")
=======
    @objid ("045387cd-49ff-4221-901e-64aa479b0d13")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setComparisonOperator(final String value) {
        this.elt.putTagValue(UnaryConstraint.MdaTypes.COMPARISONOPERATOR_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'threshold'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("bc66de03-23b1-4feb-85ba-13bd29cfd9a7")
=======
    @objid ("d01101cd-6b85-4dd4-8ff1-da59bb97d6fc")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setThreshold(final String value) {
        this.elt.putTagValue(UnaryConstraint.MdaTypes.THRESHOLD_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'validity'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("af9aa9ad-f9d0-42fc-a5e4-fa5129fd94d6")
=======
    @objid ("354a5d4e-ef7c-48c1-8fde-86ea3555d483")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setValidity(final String value) {
        this.elt.putTagValue(UnaryConstraint.MdaTypes.VALIDITY_TAGTYPE_ELT, value);
    }

<<<<<<< HEAD
    @objid ("5fb62360-9ead-48b9-ae08-5e1c584ecb7b")
=======
    @objid ("7c43805e-b897-4c78-b0bd-bbb315247a07")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected UnaryConstraint(final Constraint elt) {
        super(elt);
    }

    @objid ("2712bfc7-aedc-48b5-9543-3300cf21a241")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("b1e6d0b0-bdb6-4606-9cd3-1e29eeced1ab")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0a996dcf-3b72-496f-900f-a1beae003df4")
        public static TagType VALIDITY_TAGTYPE_ELT;

        @objid ("994ce23b-57a3-465b-a6b5-ca12a01971d0")
        public static TagType COMPARISONOPERATOR_TAGTYPE_ELT;

        @objid ("a69e6feb-5636-456c-8f80-22f8a5c75c03")
        public static TagType THRESHOLD_TAGTYPE_ELT;

        @objid ("37c03744-20bb-4d2e-bb06-2bc0a6553476")
        private static Stereotype MDAASSOCDEP;

        @objid ("a4eb5a5d-9f4d-487a-b37b-1f838f935b1c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("76db7943-b1e3-4414-8045-11936794b3c0")
=======
        @objid ("9bc25422-d6d7-4ea1-999f-1af53c03ccda")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cc61540c-9347-439e-ac03-88a653013a5b")
        public static TagType VALIDITY_TAGTYPE_ELT;

        @objid ("3a4bb918-e4bd-446c-9bec-489555fb91f5")
        public static TagType COMPARISONOPERATOR_TAGTYPE_ELT;

        @objid ("bb98ca5f-60ff-4ff4-9b41-41c325fc1168")
        public static TagType THRESHOLD_TAGTYPE_ELT;

        @objid ("29dbecd1-a77f-4675-be9e-b413da68d99e")
        private static Stereotype MDAASSOCDEP;

        @objid ("17d3ec9a-8567-4055-9c18-f6bc0bd85d41")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b222ecaa-cd03-4f5c-8191-e0094229da30")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
