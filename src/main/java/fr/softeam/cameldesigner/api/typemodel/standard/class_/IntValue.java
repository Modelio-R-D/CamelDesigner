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
 * Proxy class to handle a {@link Class} with << IntValue >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("55226fdb-80c7-4d63-9159-946742bab14b")
public class IntValue extends NumericValue {
    @objid ("ba832738-4f3b-4f14-a8fa-e6ecd8df6695")
    public static final String STEREOTYPE_NAME = "IntValue";

    @objid ("453a9ac5-3161-4c2a-a3ad-d48a698d118d")
    public static final String VALUE_TAGTYPE = "value";

    /**
     * Tells whether a {@link IntValue proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << IntValue >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("67e80614-a892-4233-b426-793c4ccb7bbd")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, IntValue.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << IntValue >> then instantiate a {@link IntValue} proxy.
     * 
     * @return a {@link IntValue} proxy on the created {@link Class}.
     */
    @objid ("e954159e-4137-434c-aeca-71d06361f5ac")
    public static IntValue create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, IntValue.STEREOTYPE_NAME);
        return IntValue.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link IntValue} proxy from a {@link Class} stereotyped << IntValue >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link IntValue} proxy or <i>null</i>.
     */
    @objid ("3eea3d1b-ca1d-4009-b086-0690a5afbebb")
    public static IntValue instantiate(final Class obj) {
        return IntValue.canInstantiate(obj) ? new IntValue(obj) : null;
    }

    /**
     * Tries to instantiate a {@link IntValue} proxy from a {@link Class} stereotyped << IntValue >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link IntValue} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e8457ba7-e970-4aee-b221-cee978f5f412")
    public static IntValue safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (IntValue.canInstantiate(obj))
            return new IntValue(obj);
        else
            throw new IllegalArgumentException("IntValue: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e3c54ce8-4d97-4835-9796-8bc34402bd5c")
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
        IntValue other = (IntValue) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("6045a6cb-ad33-4777-8b78-09b4728f3884")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2fc8b0ef-72c7-4cf2-af54-8599be055c2e")
    public String getValue() {
        return this.elt.getTagValue(IntValue.MdaTypes.VALUE_TAGTYPE_ELT);
    }

    @objid ("856ba6ff-0d12-431e-b5be-7ac296b1addf")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("33e11c02-c936-4d24-93fa-b18c1937a1b1")
    public void setValue(final String value) {
        this.elt.putTagValue(IntValue.MdaTypes.VALUE_TAGTYPE_ELT, value);
    }

    @objid ("e7a69e4c-b7f3-428f-82e4-d2cdec6c4bc4")
    protected IntValue(final Class elt) {
        super(elt);
    }

    @objid ("86784b93-598c-48c0-99d5-5e6867c51898")
    public static final class MdaTypes {
        @objid ("62e41e65-f31e-4b44-8f38-ea0bf6c6ee6a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("25126af6-4529-40cb-b06e-d965738aa460")
        public static TagType VALUE_TAGTYPE_ELT;

        @objid ("213fe5cd-417b-49e5-9730-e68382124852")
        private static Stereotype MDAASSOCDEP;

        @objid ("540f0496-dca1-4526-b8c2-197775674c70")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ab461e8c-caa1-4993-895f-9566217e2cb5")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "84b646d6-4b3e-4375-b9e3-8e6d650114b3");
            VALUE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8c63edd5-c470-41cc-a9bf-8eb948e832ba");
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
