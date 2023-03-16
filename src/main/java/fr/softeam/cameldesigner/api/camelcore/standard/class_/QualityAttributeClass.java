/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.camelcore.standard.class_;

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
 * Proxy class to handle a {@link Class} with << QualityAttribute_Class >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("00b4d8d6-dff1-41ad-8764-b639c5cef9a2")
public class QualityAttributeClass extends AttributeClass {
    @objid ("48d9b4c2-dbd9-48f8-92ff-06e949dbc2da")
    public static final String STEREOTYPE_NAME = "QualityAttribute_Class";

    /**
     * Tells whether a {@link QualityAttributeClass proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << QualityAttribute_Class >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a666617d-60fa-411b-b1cd-fbb2bc65f709")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, QualityAttributeClass.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << QualityAttribute_Class >> then instantiate a {@link QualityAttributeClass} proxy.
     * 
     * @return a {@link QualityAttributeClass} proxy on the created {@link Class}.
     */
    @objid ("a8e34e47-89c3-46bd-ba70-fc13baa0a352")
    public static QualityAttributeClass create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, QualityAttributeClass.STEREOTYPE_NAME);
        return QualityAttributeClass.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link QualityAttributeClass} proxy from a {@link Class} stereotyped << QualityAttribute_Class >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link QualityAttributeClass} proxy or <i>null</i>.
     */
    @objid ("2eceda78-1fd8-4cf4-a16f-b2dc94412677")
    public static QualityAttributeClass instantiate(final Class obj) {
        return QualityAttributeClass.canInstantiate(obj) ? new QualityAttributeClass(obj) : null;
    }

    /**
     * Tries to instantiate a {@link QualityAttributeClass} proxy from a {@link Class} stereotyped << QualityAttribute_Class >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link QualityAttributeClass} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("0c9fe96b-16b7-4046-a3dd-5979c3f0d874")
    public static QualityAttributeClass safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (QualityAttributeClass.canInstantiate(obj))
        	return new QualityAttributeClass(obj);
        else
        	throw new IllegalArgumentException("QualityAttributeClass: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e4fab6a8-2b32-49e3-b3c2-0d8870f9b55e")
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
        QualityAttributeClass other = (QualityAttributeClass) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("7eedaa60-bd53-4729-a213-c34299ff6421")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("0e4b46e3-b174-4793-a485-062ffa7d6aff")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("cb6f3f4a-2d59-4c67-888f-f977d2122310")
    protected QualityAttributeClass(final Class elt) {
        super(elt);
    }

    @objid ("b614d475-a5cc-4fb3-8a5c-4681fb5ee31d")
    public static final class MdaTypes {
        @objid ("390365d7-b82e-47c9-8af0-07d473e009ce")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("67f8c953-bb7f-418d-b801-38a5ec6f239a")
        private static Stereotype MDAASSOCDEP;

        @objid ("432cb843-4590-4570-a9ce-fd01cd1dce4e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4990de81-0cfa-42ed-b2bd-c549047d2681")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ef0c1237-df8a-4bfc-8f0b-d3ad72e39bf4");
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
