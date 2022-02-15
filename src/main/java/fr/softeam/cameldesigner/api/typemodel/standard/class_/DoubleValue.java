/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/15/22 11:06 PM by Modelio Studio.
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
    @objid ("77ddbe8b-1808-4289-92ac-7ef28edddb26")
    public static final String STEREOTYPE_NAME = "DoubleValue";

    @objid ("fbd91e3a-3095-4ba8-a6a6-c12b3bd04a02")
    public static final String VALUE_TAGTYPE = "value";

    /**
     * Tells whether a {@link DoubleValue proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << DoubleValue >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("51588721-6afb-4ade-9259-153a3cfff3d2")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DoubleValue.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << DoubleValue >> then instantiate a {@link DoubleValue} proxy.
     * 
     * @return a {@link DoubleValue} proxy on the created {@link Class}.
     */
    @objid ("df4e87cd-e88d-4d72-9ab9-655e922ef6fd")
    public static DoubleValue create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, DoubleValue.STEREOTYPE_NAME);
        return DoubleValue.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link DoubleValue} proxy from a {@link Class} stereotyped << DoubleValue >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link DoubleValue} proxy or <i>null</i>.
     */
    @objid ("c4423c66-da62-413b-94c9-69950bb08ec3")
    public static DoubleValue instantiate(final Class obj) {
        return DoubleValue.canInstantiate(obj) ? new DoubleValue(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DoubleValue} proxy from a {@link Class} stereotyped << DoubleValue >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link DoubleValue} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("60e7872b-abb1-4e5f-95f3-b80c7246dc84")
    public static DoubleValue safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (DoubleValue.canInstantiate(obj))
        	return new DoubleValue(obj);
        else
        	throw new IllegalArgumentException("DoubleValue: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("da274ea2-e4ac-4230-9ba0-4a606f64afa3")
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
     * @return the Class represented by this proxy, never null.
     */
    @objid ("71a066d4-9f6a-45fc-afc9-c6a6804715cb")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0e745476-2898-4280-831d-c0f335779630")
    public String getValue() {
        return this.elt.getTagValue(DoubleValue.MdaTypes.VALUE_TAGTYPE_ELT);
    }

    @objid ("6e9e4f21-a196-4a2b-b6fd-b77974f4ddc5")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("267ab058-25f8-4cf5-88f0-b8d0298ffb5e")
    public void setValue(final String value) {
        this.elt.putTagValue(DoubleValue.MdaTypes.VALUE_TAGTYPE_ELT, value);
    }

    @objid ("fef33696-d894-48ff-aa08-cc9e8a7ada31")
    protected DoubleValue(final Class elt) {
        super(elt);
    }

    @objid ("0478aee9-2727-4d68-be3a-307572bc0a9f")
    public static final class MdaTypes {
        @objid ("8536a11d-18fe-46b2-9245-5711fae805e2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1c8a4494-b692-4b01-b757-7e6f0aeb3e43")
        public static TagType VALUE_TAGTYPE_ELT;

        @objid ("c048ce04-87f4-4c13-8f57-e2fe361e89bf")
        private static Stereotype MDAASSOCDEP;

        @objid ("366f5759-7f58-4c6a-a1ee-8ff08a1fb36f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("88684b63-d4c3-455b-aa8d-61b9da468470")
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
