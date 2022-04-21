/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.09

 * This file was generated on 4/20/22 10:37 AM by Modelio Studio.
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
    @objid ("02eeb4cd-32b4-4687-933b-6fb4ba018d51")
    public static final String STEREOTYPE_NAME = "DataInstanceModelDiagram";

    /**
     * Tells whether a {@link DataInstanceModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << DataInstanceModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ea0126b1-a843-42e6-975f-9485fa9a8c42")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataInstanceModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << DataInstanceModelDiagram >> then instantiate a {@link DataInstanceModelDiagram} proxy.
     * 
     * @return a {@link DataInstanceModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("bc974118-834a-4db8-8593-c7f3dbb6dad1")
    public static DataInstanceModelDiagram create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, DataInstanceModelDiagram.STEREOTYPE_NAME);
        return DataInstanceModelDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link DataInstanceModelDiagram} proxy from a {@link ClassDiagram} stereotyped << DataInstanceModelDiagram >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a ClassDiagram
     * @return a {@link DataInstanceModelDiagram} proxy or <i>null</i>.
     */
    @objid ("7dae4c8a-89aa-470c-a5fc-afab7dfec3e7")
    public static DataInstanceModelDiagram instantiate(final ClassDiagram obj) {
        return DataInstanceModelDiagram.canInstantiate(obj) ? new DataInstanceModelDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DataInstanceModelDiagram} proxy from a {@link ClassDiagram} stereotyped << DataInstanceModelDiagram >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link ClassDiagram}
     * @return a {@link DataInstanceModelDiagram} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("2406eb17-f0a8-4d3f-b43f-105254e66934")
    public static DataInstanceModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (DataInstanceModelDiagram.canInstantiate(obj))
            return new DataInstanceModelDiagram(obj);
        else
            throw new IllegalArgumentException("DataInstanceModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("280bfb9d-7b74-43d7-985c-7213d7267cc5")
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
     * 
     * @return the ClassDiagram represented by this proxy, never null.
     */
    @objid ("f0e9c372-95bf-4e8c-b403-a52f47a409d2")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("ba095bb3-5589-48f8-adea-dd712beaefc6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("9078be55-5d9b-4f46-9445-131e715018a3")
    protected DataInstanceModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("fe41e622-b57a-48fd-aa9b-ded14e5c5266")
    public static final class MdaTypes {
        @objid ("43c360fa-b43d-40e7-8141-3da8dbe7eb06")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("10b4e9eb-b352-42fb-bc74-9c073f32fced")
        private static Stereotype MDAASSOCDEP;

        @objid ("36cb2942-1f54-48f5-9ce6-e31697e32e26")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("80493176-e907-4d0a-af02-9cb853018f68")
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
