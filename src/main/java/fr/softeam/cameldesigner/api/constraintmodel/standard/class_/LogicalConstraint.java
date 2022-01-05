/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v0.0.10

 * This file was generated on 7/24/20 11:19 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.constraintmodel.standard.class_;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << LogicalConstraint >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("323df5f0-4e02-4ee1-99d8-bf0b6eb61f21")
public class LogicalConstraint extends CompositeConstraint {
    @objid ("9d3e7fcd-73cb-4887-aa26-4490dfab1aaa")
    public static final String STEREOTYPE_NAME = "LogicalConstraint";

    @objid ("83d0ac40-4a0d-4f1c-a53d-f3b7c7fac0f3")
    public static final String LOGICALOPERATOR_TAGTYPE = "logicalOperator";

    /**
     * Tells whether a {@link LogicalConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << LogicalConstraint >>.
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("8bab5453-5561-48a5-afff-9b66d6a13f04")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, LogicalConstraint.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << LogicalConstraint >> then instantiate a {@link LogicalConstraint} proxy.
     * 
     * @return a {@link LogicalConstraint} proxy on the created {@link Class}.
     */
    @objid ("8d77b263-57e8-42ae-97a2-13d9be48439b")
    public static LogicalConstraint create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, LogicalConstraint.STEREOTYPE_NAME);
        return LogicalConstraint.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link LogicalConstraint} proxy from a {@link Class} stereotyped << LogicalConstraint >>checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link LogicalConstraint} proxy or <i>null</i>.
     */
    @objid ("5ea026aa-bd27-4d75-971d-da08273ed979")
    public static LogicalConstraint instantiate(final Class obj) {
        return LogicalConstraint.canInstantiate(obj) ? new LogicalConstraint(obj) : null;
    }

    /**
     * Tries to instantiate a {@link LogicalConstraint} proxy from a {@link Class} stereotyped << LogicalConstraint >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link LogicalConstraint} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f6a24eb1-91f3-4acc-968d-4bee0fae9293")
    public static LogicalConstraint safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (LogicalConstraint.canInstantiate(obj))
            return new LogicalConstraint(obj);
        else
            throw new IllegalArgumentException("LogicalConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("25eb5090-466b-404e-b8fe-9e26ccec1097")
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
        LogicalConstraint other = (LogicalConstraint) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("eef514df-42c8-48fb-9f61-7eae2e58dc0c")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'logicalOperator'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("34420750-4959-4774-9758-c6c1d64590b6")
    public String getLogicalOperator() {
        return this.elt.getTagValue(LogicalConstraint.MdaTypes.LOGICALOPERATOR_TAGTYPE_ELT);
    }

    @objid ("1d10ff5e-898b-4903-b4f9-605b3353271e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'logicalOperator'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("374c7649-1cbc-44a4-9b64-74a7c8dda62e")
    public void setLogicalOperator(final String value) {
        this.elt.putTagValue(LogicalConstraint.MdaTypes.LOGICALOPERATOR_TAGTYPE_ELT, value);
    }

    @objid ("9beb1833-a7e9-4e56-a086-1793a05256a3")
    protected LogicalConstraint(final Class elt) {
        super(elt);
    }

    @objid ("23cc3fb9-bafc-4c27-aba4-e9ff6eade06e")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("d4501319-946d-4963-b2cb-a4378b1b7c06")
    public static final class MdaTypes {
        @objid ("eb5e0c28-8b82-4632-be20-4aeef8406164")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d81f4543-ab05-41c0-aa63-aec8fcff0c7f")
        public static TagType LOGICALOPERATOR_TAGTYPE_ELT;

        @objid ("6a4fc0ee-4785-4402-9d3b-f47ef6ba25a3")
        private static Stereotype MDAASSOCDEP;

        @objid ("acc88b8a-7a9f-49ef-97bb-ab143c8c313a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("bb9e6f68-a3d1-49ad-96f3-9ca35742bf91")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "880c9eb2-61f6-4abf-a857-d91c481be6cd");
            LOGICALOPERATOR_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c0dbb823-5d86-4238-b102-34d300327b5d");
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
