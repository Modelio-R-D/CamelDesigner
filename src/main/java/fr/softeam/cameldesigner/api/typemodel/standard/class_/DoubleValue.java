/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.typemodel.standard.class_;

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
 * Proxy class to handle a {@link Class} with << DoubleValue >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("cc20daad-6f47-4d3a-babd-121eb172a4cb")
public class DoubleValue extends NumericValue {
    @objid ("41d374a4-3e95-47dc-9d20-0c7867fcfea6")
    public static final String STEREOTYPE_NAME = "DoubleValue";

    @objid ("1cf8f3f3-0f55-4c18-8090-0e5f91a12123")
    public static final String VALUE_TAGTYPE = "value";

    /**
     * Tells whether a {@link DoubleValue proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << DoubleValue >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a4a87b9e-81fc-4875-9d1b-2f2a7f3c4ce3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DoubleValue.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << DoubleValue >> then instantiate a {@link DoubleValue} proxy.
     * 
     * @return a {@link DoubleValue} proxy on the created {@link Class}.
     */
    @objid ("9ea1ce4f-5db2-471b-ba44-77efdd9833e3")
    public static DoubleValue create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, DoubleValue.STEREOTYPE_NAME);
        return DoubleValue.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link DoubleValue} proxy from a {@link Class} stereotyped << DoubleValue >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link DoubleValue} proxy or <i>null</i>.
     */
    @objid ("d752cb93-f03f-458c-97b8-03d3d5fe4644")
    public static DoubleValue instantiate(final Class obj) {
        return DoubleValue.canInstantiate(obj) ? new DoubleValue(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DoubleValue} proxy from a {@link Class} stereotyped << DoubleValue >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link DoubleValue} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f00a5082-dd6d-4368-92c3-d7ca6877f611")
    public static DoubleValue safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (DoubleValue.canInstantiate(obj))
            return new DoubleValue(obj);
        else
            throw new IllegalArgumentException("DoubleValue: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ed45d42c-b0aa-4a2e-b4c7-af138287feda")
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
        DoubleValue other = (DoubleValue) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("fc5afcda-8df9-4271-b890-9047eabea290")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("cbaf9d98-48fd-487e-93b7-6d093cc1b539")
    public String getValue() {
        return this.elt.getTagValue(DoubleValue.MdaTypes.VALUE_TAGTYPE_ELT);
    }

    @objid ("64984b1e-3d18-495f-87b5-4d6d62ccd287")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("37fa6dd2-984d-4958-b7ce-0e12df365bf2")
    public void setValue(final String value) {
        this.elt.putTagValue(DoubleValue.MdaTypes.VALUE_TAGTYPE_ELT, value);
    }

    @objid ("de30246d-f681-4402-b173-17e2fa2f61a0")
    protected DoubleValue(final Class elt) {
        super(elt);
    }

    @objid ("0478aee9-2727-4d68-be3a-307572bc0a9f")
    public static final class MdaTypes {
        @objid ("416c92d7-6eee-4e8d-b186-038eb5b10cca")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("777eec00-454b-4ab1-8af6-c45bd8b20c85")
        public static TagType VALUE_TAGTYPE_ELT;

        @objid ("853b6514-54e4-4447-9937-616deb112197")
        private static Stereotype MDAASSOCDEP;

        @objid ("f85aebc6-bf4f-41dd-b48c-81ac60370295")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("95b98487-0b7f-418f-af2e-af50fc040b81")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "6f7f3c3b-3812-4284-9665-7696d52500f2");
            VALUE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8e0fd000-262b-4aa6-9b35-fea753d10683");
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
