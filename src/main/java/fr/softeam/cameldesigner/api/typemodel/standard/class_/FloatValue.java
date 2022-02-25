/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/25/22 11:13 AM by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << FloatValue >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("c564a192-5f95-43db-852f-76f717dcdaa6")
public class FloatValue extends NumericValue {
    @objid ("16c22609-f246-4ab2-b9b5-869dbfffc13f")
    public static final String STEREOTYPE_NAME = "FloatValue";

    @objid ("14ca9ce9-344d-4da0-b6f8-07cd01bc93f3")
    public static final String VALUE_TAGTYPE = "value";

    /**
     * Tells whether a {@link FloatValue proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << FloatValue >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a14a34a0-fc3a-4e6c-8251-11226746e6ba")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FloatValue.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << FloatValue >> then instantiate a {@link FloatValue} proxy.
     * 
     * @return a {@link FloatValue} proxy on the created {@link Class}.
     */
    @objid ("7c7ff4e8-80f3-41d1-aa66-30f668a5cd11")
    public static FloatValue create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, FloatValue.STEREOTYPE_NAME);
        return FloatValue.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link FloatValue} proxy from a {@link Class} stereotyped << FloatValue >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link FloatValue} proxy or <i>null</i>.
     */
    @objid ("aaa96433-0083-481e-9327-ff6323d513d4")
    public static FloatValue instantiate(final Class obj) {
        return FloatValue.canInstantiate(obj) ? new FloatValue(obj) : null;
    }

    /**
     * Tries to instantiate a {@link FloatValue} proxy from a {@link Class} stereotyped << FloatValue >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link FloatValue} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("63fa5b79-08a3-47fb-ac84-8a2fb65e1f29")
    public static FloatValue safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (FloatValue.canInstantiate(obj))
        	return new FloatValue(obj);
        else
        	throw new IllegalArgumentException("FloatValue: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0f68920c-ae96-4b76-b012-24f345213be8")
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
        FloatValue other = (FloatValue) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("e8bd1669-43b4-4696-b5f2-35f9307fbdfc")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("85417f31-00b4-4e32-be73-6094af00542d")
    public String getValue() {
        return this.elt.getTagValue(FloatValue.MdaTypes.VALUE_TAGTYPE_ELT);
    }

    @objid ("af4f48b9-0ecd-4b04-92e4-6d162b5658cc")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ad56b9b3-2dff-46ab-be88-09b403263d01")
    public void setValue(final String value) {
        this.elt.putTagValue(FloatValue.MdaTypes.VALUE_TAGTYPE_ELT, value);
    }

    @objid ("f3881b25-e435-4e05-93b7-c699690ddb7d")
    protected FloatValue(final Class elt) {
        super(elt);
    }

    @objid ("95a225c8-f353-4ac6-a77b-c22f2f7d009e")
    public static final class MdaTypes {
        @objid ("f5b90237-770d-43ce-a6fb-92fb2c39d16a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("fb5c27da-3538-412c-8749-6a2545888349")
        public static TagType VALUE_TAGTYPE_ELT;

        @objid ("041369bf-1369-4201-8b42-0d20ebf868ec")
        private static Stereotype MDAASSOCDEP;

        @objid ("68bb8cb1-38d9-4243-9ab7-9f0fe2482309")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f6922698-8e35-4aec-8131-e488be9874f4")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b1f1ce0e-5329-4ea6-ad29-efcecf0e3fd3");
            VALUE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "39512df5-0c85-431c-a6e2-bda678216414");
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
