/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
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
    @objid ("2c91310d-34ff-4d26-862d-76ceeb89e008")
    public static final String STEREOTYPE_NAME = "TypeModelDiagram";

    /**
     * Tells whether a {@link TypeModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << TypeModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("361b5678-0258-4664-98a2-c027e559330e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, TypeModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << TypeModelDiagram >> then instantiate a {@link TypeModelDiagram} proxy.
     * 
     * @return a {@link TypeModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("eaee9d92-bb40-46d0-9a4d-834c94752eef")
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
    @objid ("01c70865-859f-4ae8-b049-945cccbe31f6")
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
    @objid ("b204d1a0-3dee-4c64-a8bf-6ba2aed7753e")
    public static TypeModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (TypeModelDiagram.canInstantiate(obj))
        	return new TypeModelDiagram(obj);
        else
        	throw new IllegalArgumentException("TypeModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("eeed436f-a4e3-41f8-9fa2-332bb0142e39")
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
    @objid ("438a12de-30fd-4bb7-8dfa-bb8f8491ed9c")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("d88bdc25-294d-4156-9828-a30cacf6f6e0")
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

    @objid ("6c81195d-be40-4125-bf15-3666a64f53e5")
    protected TypeModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("be25d91d-24c1-40f8-ab27-4d81ae2fa976")
    public static final class MdaTypes {
        @objid ("19f9b3c9-4b37-4b39-b2b0-dd3984e14b36")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cabc2b3a-f702-44fd-a913-388e01672266")
        private static Stereotype MDAASSOCDEP;

        @objid ("9743e258-241d-4b3f-9f54-76f890198b6a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("119bcfe7-d82a-4198-8856-ce5e0a82c97e")
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
