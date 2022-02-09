/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/8/22 11:47 AM by Modelio Studio.
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
    @objid ("820b7e30-1793-4a75-b2ac-b45e1c93b69b")
    public static final String STEREOTYPE_NAME = "IntValue";

    @objid ("480cea42-41bf-452c-90fc-c2780df1b011")
    public static final String VALUE_TAGTYPE = "value";

    /**
     * Tells whether a {@link IntValue proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << IntValue >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ed050bc5-3c18-48c1-aab2-45741c9c9d6d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, IntValue.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << IntValue >> then instantiate a {@link IntValue} proxy.
     * 
     * @return a {@link IntValue} proxy on the created {@link Class}.
     */
    @objid ("e7bde511-1a25-47b7-81ee-d9bb77f53dab")
    public static IntValue create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, IntValue.STEREOTYPE_NAME);
        return IntValue.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link IntValue} proxy from a {@link Class} stereotyped << IntValue >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link IntValue} proxy or <i>null</i>.
     */
    @objid ("b09e7a06-ec20-47f9-9d0b-3f36c5105788")
    public static IntValue instantiate(final Class obj) {
        return IntValue.canInstantiate(obj) ? new IntValue(obj) : null;
    }

    /**
     * Tries to instantiate a {@link IntValue} proxy from a {@link Class} stereotyped << IntValue >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link IntValue} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("8df28146-7caa-4d4f-b9ca-80bfaff06be3")
    public static IntValue safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (IntValue.canInstantiate(obj))
        	return new IntValue(obj);
        else
        	throw new IllegalArgumentException("IntValue: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8bfc75da-b05c-4921-a24d-4b5bf5d85a8d")
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
     * @return the Class represented by this proxy, never null.
     */
    @objid ("ff71b6ff-1b45-4ae6-aac8-fd54ea20853d")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0f69ed73-094f-4dd5-b9b5-f7af6ed45922")
    public String getValue() {
        return this.elt.getTagValue(IntValue.MdaTypes.VALUE_TAGTYPE_ELT);
    }

    @objid ("832b1a33-a8dc-4544-a016-6442eb5e58ea")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c92753ec-1b09-4721-ab4e-7dcd586219e4")
    public void setValue(final String value) {
        this.elt.putTagValue(IntValue.MdaTypes.VALUE_TAGTYPE_ELT, value);
    }

    @objid ("ffdae4c0-0b25-4952-9406-e16874924a42")
    protected IntValue(final Class elt) {
        super(elt);
    }

    @objid ("86784b93-598c-48c0-99d5-5e6867c51898")
    public static final class MdaTypes {
        @objid ("93d77e23-1154-46fd-b9e3-339b824471ee")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d685dac1-4879-4f46-8162-ab8acd522201")
        public static TagType VALUE_TAGTYPE_ELT;

        @objid ("5f385dd8-f9a8-4e4f-ae5a-651e6430ebdb")
        private static Stereotype MDAASSOCDEP;

        @objid ("516be912-6ce6-4c5c-8284-8e4758f3768c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a4218749-bb18-400d-b642-5073300d21e0")
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
