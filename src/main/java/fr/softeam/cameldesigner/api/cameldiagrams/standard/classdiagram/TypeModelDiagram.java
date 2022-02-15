/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/15/22 11:06 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.cameldiagrams.infrastructure.abstractdiagram.AbstractCamelDiagram;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.ClassDiagram;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ClassDiagram} with << TypeModelDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("1573d2fb-b10e-4c0a-bdc5-26ed12c40524")
public class TypeModelDiagram extends AbstractCamelDiagram {
    @objid ("8efdb972-5fdc-4016-a051-7d85cd137d00")
    public static final String STEREOTYPE_NAME = "TypeModelDiagram";

    /**
     * Tells whether a {@link TypeModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << TypeModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("8868703c-c301-4f7a-8257-777b271d8e5f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, TypeModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << TypeModelDiagram >> then instantiate a {@link TypeModelDiagram} proxy.
     * 
     * @return a {@link TypeModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("4d614c05-f379-4016-84b1-f2ee9201e67f")
    public static TypeModelDiagram create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, TypeModelDiagram.STEREOTYPE_NAME);
        return TypeModelDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link TypeModelDiagram} proxy from a {@link ClassDiagram} stereotyped << TypeModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ClassDiagram
     * @return a {@link TypeModelDiagram} proxy or <i>null</i>.
     */
    @objid ("11d4b86e-3763-4096-bfeb-5362ee615caf")
    public static TypeModelDiagram instantiate(final ClassDiagram obj) {
        return TypeModelDiagram.canInstantiate(obj) ? new TypeModelDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TypeModelDiagram} proxy from a {@link ClassDiagram} stereotyped << TypeModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ClassDiagram}
     * @return a {@link TypeModelDiagram} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("0cfc35fa-db18-4046-bfff-23bb498970f8")
    public static TypeModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (TypeModelDiagram.canInstantiate(obj))
        	return new TypeModelDiagram(obj);
        else
        	throw new IllegalArgumentException("TypeModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8f59a15a-b813-4742-a8b9-781d94309712")
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
        TypeModelDiagram other = (TypeModelDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ClassDiagram}. 
     * @return the ClassDiagram represented by this proxy, never null.
     */
    @objid ("2725e358-52c1-455c-80ba-dc409a4c27b1")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("4c764cb4-8df4-492f-a0ca-c0a441db9162")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("a8c56d0d-d911-4a2a-b83f-55619771a65c")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("0b915368-2e6e-479b-810f-8d0857339dc3")
    protected TypeModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("be25d91d-24c1-40f8-ab27-4d81ae2fa976")
    public static final class MdaTypes {
        @objid ("120416f8-be79-4648-86f5-f9587f642588")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a5eaaf93-dba4-4840-b68c-dd96fc1ad9c0")
        private static Stereotype MDAASSOCDEP;

        @objid ("9701316a-fa87-4d8c-9614-9387816195ad")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3c57528b-1d4c-4efa-a6f9-34e15434f048")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "e909af8e-708a-490e-886c-55037a9674e1");
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
