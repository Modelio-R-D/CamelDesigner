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
 * Proxy class to handle a {@link ClassDiagram} with << RequirementModelDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("c0f09b77-0e4b-430d-a7da-01382979d1a3")
public class RequirementModelDiagram extends AbstractCamelDiagram {
    @objid ("dbe4495b-30a6-4120-a0c0-a259288f3c10")
    public static final String STEREOTYPE_NAME = "RequirementModelDiagram";

    /**
     * Tells whether a {@link RequirementModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << RequirementModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("3fa2980b-4189-4f5a-8488-3819b43a2b5b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, RequirementModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << RequirementModelDiagram >> then instantiate a {@link RequirementModelDiagram} proxy.
     * 
     * @return a {@link RequirementModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("5016a7be-7b0f-4db2-acfe-af9f41cc8b70")
    public static RequirementModelDiagram create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, RequirementModelDiagram.STEREOTYPE_NAME);
        return RequirementModelDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link RequirementModelDiagram} proxy from a {@link ClassDiagram} stereotyped << RequirementModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ClassDiagram
     * @return a {@link RequirementModelDiagram} proxy or <i>null</i>.
     */
    @objid ("36ef1d75-a906-4d13-9a96-5944efa6aae7")
    public static RequirementModelDiagram instantiate(final ClassDiagram obj) {
        return RequirementModelDiagram.canInstantiate(obj) ? new RequirementModelDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RequirementModelDiagram} proxy from a {@link ClassDiagram} stereotyped << RequirementModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ClassDiagram}
     * @return a {@link RequirementModelDiagram} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e93348c5-a35e-42f0-b662-c3e11585a67d")
    public static RequirementModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (RequirementModelDiagram.canInstantiate(obj))
        	return new RequirementModelDiagram(obj);
        else
        	throw new IllegalArgumentException("RequirementModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("24009935-3b51-4be6-9497-217e57ed3052")
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
        RequirementModelDiagram other = (RequirementModelDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ClassDiagram}. 
     * @return the ClassDiagram represented by this proxy, never null.
     */
    @objid ("34468ee0-068b-40bc-8a74-a7d7143e4c5e")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("0b362dc8-2895-4735-8665-2444d1e2957e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("b1634cc6-b458-4c77-a363-aebccf9cb19d")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("c8571bab-e0d4-4174-98ef-554b438392dd")
    protected RequirementModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("b49732d9-0960-4c1f-a15a-9b345f5f99f2")
    public static final class MdaTypes {
        @objid ("afc459fd-1a67-491e-a7d0-d4ab98ec809a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7e1dfa38-f544-4df0-a0e1-5bba8f549366")
        private static Stereotype MDAASSOCDEP;

        @objid ("1f91b743-167b-46f7-8865-1c6d9f4e4631")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("97a00299-0802-462f-84eb-8980963752cc")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "f8879e00-7139-4923-a7ff-67ebdb678e5b");
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
