/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/20/22 3:44 PM by Modelio Studio.
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
 * Proxy class to handle a {@link ClassDiagram} with << CamelModelDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("2c59f838-a1e2-4ac9-bf6c-e229175cc354")
public class CamelModelDiagram extends AbstractCamelDiagram {
    @objid ("c9c9e1b1-5d9f-49f2-b07a-c6e4aa129204")
    public static final String STEREOTYPE_NAME = "CamelModelDiagram";

    /**
     * Tells whether a {@link CamelModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << CamelModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f047bf1b-831c-472c-8ff0-6be314cbd761")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CamelModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << CamelModelDiagram >> then instantiate a {@link CamelModelDiagram} proxy.
     * 
     * @return a {@link CamelModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("592d8f6f-7860-44d6-96c6-77835e8896f6")
    public static CamelModelDiagram create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, CamelModelDiagram.STEREOTYPE_NAME);
        return CamelModelDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link CamelModelDiagram} proxy from a {@link ClassDiagram} stereotyped << CamelModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ClassDiagram
     * @return a {@link CamelModelDiagram} proxy or <i>null</i>.
     */
    @objid ("b7b7d5e8-6558-4ee1-b0a2-e9758d1dcd6a")
    public static CamelModelDiagram instantiate(final ClassDiagram obj) {
        return CamelModelDiagram.canInstantiate(obj) ? new CamelModelDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CamelModelDiagram} proxy from a {@link ClassDiagram} stereotyped << CamelModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ClassDiagram}
     * @return a {@link CamelModelDiagram} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("8aff32e5-b126-4bc5-b788-a1a691feee0c")
    public static CamelModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (CamelModelDiagram.canInstantiate(obj))
        	return new CamelModelDiagram(obj);
        else
        	throw new IllegalArgumentException("CamelModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("65c70639-fecd-4177-a6a5-98c1bb70d7e0")
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
        CamelModelDiagram other = (CamelModelDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ClassDiagram}. 
     * @return the ClassDiagram represented by this proxy, never null.
     */
    @objid ("a5addda8-0a11-4812-a134-dd827aaa15ce")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("c8c835dd-c2f6-46fc-833f-396cdf64accf")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("5b21fb26-6961-4938-af13-561334ff9a3d")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("38eca1fe-2869-4c50-9664-2bef20554143")
    protected CamelModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("4c4f1d52-c636-4b3b-a84c-7e0d2ad342f4")
    public static final class MdaTypes {
        @objid ("3a115487-71a2-43a3-9e8e-f82dcd7d6421")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("459c20dd-329c-4a88-9ae4-5d3080dd462e")
        private static Stereotype MDAASSOCDEP;

        @objid ("b49e0cdb-0b02-44e4-8cf6-74acd006ff32")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b49eafbf-f6c5-493b-aee4-08037aa7c5c7")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "eec7381e-4c61-4f7c-9a1c-210f2fe38377");
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
