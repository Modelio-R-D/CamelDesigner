/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/25/22 11:13 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.camelcore.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelAttribute;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.FeaturePackage;
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
 * Proxy class to handle a {@link Class} with << Attribute_Class >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("6f9ce9fc-dd24-4913-b74c-5e47d6057bf1")
public class AttributeClass extends CamelAttribute {
    @objid ("5a0918d4-7cf8-469c-9bd6-8cdd8ed59806")
    public static final String STEREOTYPE_NAME = "Attribute_Class";

    /**
     * Tells whether a {@link AttributeClass proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Attribute_Class >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("945d2b21-0a93-4001-b177-170fe224475d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, AttributeClass.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Attribute_Class >> then instantiate a {@link AttributeClass} proxy.
     * 
     * @return a {@link AttributeClass} proxy on the created {@link Class}.
     */
    @objid ("2ba69bbc-b8fe-4988-8d07-e4decd789aa2")
    public static AttributeClass create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, AttributeClass.STEREOTYPE_NAME);
        return AttributeClass.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link AttributeClass} proxy from a {@link Class} stereotyped << Attribute_Class >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link AttributeClass} proxy or <i>null</i>.
     */
    @objid ("555260d4-fd65-400f-92fd-0697575fad6a")
    public static AttributeClass instantiate(final Class obj) {
        return AttributeClass.canInstantiate(obj) ? new AttributeClass(obj) : null;
    }

    /**
     * Tries to instantiate a {@link AttributeClass} proxy from a {@link Class} stereotyped << Attribute_Class >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link AttributeClass} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("5e72375e-c607-4d84-a918-d6277635a044")
    public static AttributeClass safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (AttributeClass.canInstantiate(obj))
        	return new AttributeClass(obj);
        else
        	throw new IllegalArgumentException("AttributeClass: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e457e7eb-3a63-4ae7-9ff6-dc3609cc9038")
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
        AttributeClass other = (AttributeClass) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("cef43c4c-7691-4e56-83f4-e220198fc976")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value to the 'parent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("5149b634-c8c2-4223-afa9-82e38f7cc85e")
    public FeaturePackage getParent() {
        return (FeaturePackage)CamelDesignerProxyFactory.instantiate(((Class) this.elt).getOwner(), FeaturePackage.STEREOTYPE_NAME);
    }

    @objid ("551a5d7a-3f83-45de-9b47-05cecfd990c0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'parent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("0a26afdb-8f1b-4537-8ae2-9618a391c4a6")
    public void setParent(final FeaturePackage obj) {
        ((Class) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    @objid ("4c10ffd7-f1e0-4537-a680-97f101eee2a6")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("d607bc57-99ac-4652-b1ce-8ba7f3f82d99")
    @Override
    public String getValue() {
        // TODO Auto-generated method stub
        return null;
    }

    @objid ("3bb462cd-ba23-4add-aac9-603a8b4ef6e9")
    @Override
    public void setValue(String value) {
        // TODO Auto-generated method stub
    }

    @objid ("daf6dc19-2894-4b36-9e7c-5b6759ae3be7")
    protected AttributeClass(final Class elt) {
        super(elt);
    }

    @objid ("2e6d4ec3-39e4-419d-8e8c-ec5e59d6a3cb")
    public static final class MdaTypes {
        @objid ("44cf3a0d-c2d4-44a8-b3b9-553345baf0f5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d9c4d4ad-bac0-4f1f-9433-d79e39f53b4d")
        private static Stereotype MDAASSOCDEP;

        @objid ("f8287e35-d4fa-499f-9fde-dff9f63deb87")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1dcb8002-d426-4326-9d19-8c6bcc05eec8")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b062f4ef-e492-4b34-9caa-bdd63d717cb9");
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
