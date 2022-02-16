/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/16/22 10:46 AM by Modelio Studio.
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
    @objid ("25c5e4b1-366f-4fe7-8bef-e44c225f870f")
    public static final String STEREOTYPE_NAME = "TypeModelDiagram";

    /**
     * Tells whether a {@link TypeModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << TypeModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d475749f-2586-41f8-94f5-8aaaf52096c7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, TypeModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << TypeModelDiagram >> then instantiate a {@link TypeModelDiagram} proxy.
     * 
     * @return a {@link TypeModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("80999f97-717d-4e88-ab6d-793cee5e3b82")
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
    @objid ("4fe391dd-9855-4ef3-989d-d0a8962906c2")
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
    @objid ("02bff668-6351-4b60-b448-0dac8af083d4")
    public static TypeModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (TypeModelDiagram.canInstantiate(obj))
        	return new TypeModelDiagram(obj);
        else
        	throw new IllegalArgumentException("TypeModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("cb1611fa-5275-4702-9d07-34511dbd7bf1")
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
    @objid ("e5d413ed-a0b3-4460-a981-b0bd74f9e086")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("209b1487-0c0b-455c-bf3c-8cd424441c90")
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

    @objid ("fe2f4e22-0dde-4f61-843a-f9f72d467294")
    protected TypeModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("be25d91d-24c1-40f8-ab27-4d81ae2fa976")
    public static final class MdaTypes {
        @objid ("7996c452-4a6c-4459-bf2b-d4a78921c163")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("dcd4f855-7366-4be8-a1c6-96b4b40eaafb")
        private static Stereotype MDAASSOCDEP;

        @objid ("b95b99aa-041b-4d0c-bd84-44cd07f50362")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("338fb69b-c24a-4c4c-a8e9-422c4ff28a7d")
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
