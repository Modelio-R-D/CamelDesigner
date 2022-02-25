/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/25/22 11:13 AM by Modelio Studio.
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
    @objid ("4f76ecb9-1ec1-4c4e-95d6-e89014b33d30")
    public static final String STEREOTYPE_NAME = "DataInstanceModelDiagram";

    /**
     * Tells whether a {@link DataInstanceModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << DataInstanceModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("8af3e1e5-5c1c-4300-9b9e-13d415d9f234")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataInstanceModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << DataInstanceModelDiagram >> then instantiate a {@link DataInstanceModelDiagram} proxy.
     * 
     * @return a {@link DataInstanceModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("b1c57edc-42d4-4fa0-8111-26c47b7736db")
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
    @objid ("01a87f07-b995-41bb-8be4-75da65e597e6")
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
    @objid ("2cb238c4-5471-4041-addd-348c7f2f57b3")
    public static DataInstanceModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (DataInstanceModelDiagram.canInstantiate(obj))
        	return new DataInstanceModelDiagram(obj);
        else
        	throw new IllegalArgumentException("DataInstanceModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("719d7a86-6a71-42ef-aa18-0e8229a5c72d")
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
    @objid ("2d4afd3d-161e-48fb-a599-ef83283cc8ae")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("137b0ed1-bb29-4bf4-9942-d7f923f5f703")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("aed9bb18-6946-4319-8557-121254bc224b")
    protected DataInstanceModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("fe41e622-b57a-48fd-aa9b-ded14e5c5266")
    public static final class MdaTypes {
        @objid ("f39c13dd-41bf-44b4-a46a-4d03b466f52b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e407a85b-c9ac-4d91-a47d-9c6a0f2dd648")
        private static Stereotype MDAASSOCDEP;

        @objid ("9a819530-a989-4516-9a00-3bb1aa7fe0bd")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("77ca7a5d-155c-4c68-8b61-22e10d4f8655")
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
