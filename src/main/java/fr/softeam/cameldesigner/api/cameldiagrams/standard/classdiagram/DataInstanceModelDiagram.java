/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/16/22 10:46 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
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
 * Proxy class to handle a {@link ClassDiagram} with << DataInstanceModelDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("906f0452-ad9b-42bb-a248-2b290f3a2571")
public class DataInstanceModelDiagram extends AbstractCamelDiagram {
    @objid ("1e168e02-8aa0-4238-9780-f4b649964f00")
    public static final String STEREOTYPE_NAME = "DataInstanceModelDiagram";

    /**
     * Tells whether a {@link DataInstanceModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << DataInstanceModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("6e85eb23-b811-47cb-bb4d-62d4fbb8083f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataInstanceModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << DataInstanceModelDiagram >> then instantiate a {@link DataInstanceModelDiagram} proxy.
     * 
     * @return a {@link DataInstanceModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("eec93892-6fee-4c58-93d5-da417c910751")
    public static DataInstanceModelDiagram create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, DataInstanceModelDiagram.STEREOTYPE_NAME);
        return DataInstanceModelDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link DataInstanceModelDiagram} proxy from a {@link ClassDiagram} stereotyped << DataInstanceModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ClassDiagram
     * @return a {@link DataInstanceModelDiagram} proxy or <i>null</i>.
     */
    @objid ("6705d4aa-d676-4334-9ef2-3bb67d8c15bf")
    public static DataInstanceModelDiagram instantiate(final ClassDiagram obj) {
        return DataInstanceModelDiagram.canInstantiate(obj) ? new DataInstanceModelDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DataInstanceModelDiagram} proxy from a {@link ClassDiagram} stereotyped << DataInstanceModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ClassDiagram}
     * @return a {@link DataInstanceModelDiagram} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("517b0fcd-6dfa-43b8-9409-0fe3dd90c447")
    public static DataInstanceModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (DataInstanceModelDiagram.canInstantiate(obj))
        	return new DataInstanceModelDiagram(obj);
        else
        	throw new IllegalArgumentException("DataInstanceModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2ddf456c-7dfb-4995-9ad4-3ef0a7d6acb9")
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
        DataInstanceModelDiagram other = (DataInstanceModelDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ClassDiagram}. 
     * @return the ClassDiagram represented by this proxy, never null.
     */
    @objid ("49f34fda-9600-4a4d-bca2-aaac9911227d")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("a4815e0c-43fd-4135-9dbf-b9d9ee2be563")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("fc8614f8-4d37-4d1a-849d-41f7434f61c3")
    protected DataInstanceModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("fe41e622-b57a-48fd-aa9b-ded14e5c5266")
    public static final class MdaTypes {
        @objid ("b4f97ba9-f4ff-4a76-b11a-b2d34dd7964e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8d418728-5fb2-475f-81b5-9bf11191226f")
        private static Stereotype MDAASSOCDEP;

        @objid ("87a5593c-a174-4cc8-8eb9-b8aa121ce1f4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8f8e458b-8161-4fa3-bd1b-be5c26ec2956")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "8ab145ba-4bc6-410d-be7a-b17e36147115");
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
