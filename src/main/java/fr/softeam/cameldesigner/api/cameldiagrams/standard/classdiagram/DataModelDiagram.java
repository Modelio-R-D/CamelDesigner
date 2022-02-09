/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/8/22 11:47 AM by Modelio Studio.
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
 * Proxy class to handle a {@link ClassDiagram} with << DataModelDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("05f54bfd-dbfd-4864-835a-f9d72e6569b8")
public class DataModelDiagram extends AbstractCamelDiagram {
    @objid ("72750bce-2865-4724-b0f7-c89ed6bc0059")
    public static final String STEREOTYPE_NAME = "DataModelDiagram";

    /**
     * Tells whether a {@link DataModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << DataModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("38489676-9fee-4613-985d-9f5ef4e39bdf")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << DataModelDiagram >> then instantiate a {@link DataModelDiagram} proxy.
     * 
     * @return a {@link DataModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("f280c9e0-0706-4bee-a267-8767232b1ff1")
    public static DataModelDiagram create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, DataModelDiagram.STEREOTYPE_NAME);
        return DataModelDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link DataModelDiagram} proxy from a {@link ClassDiagram} stereotyped << DataModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ClassDiagram
     * @return a {@link DataModelDiagram} proxy or <i>null</i>.
     */
    @objid ("000c5c99-030b-407a-8e9e-305a48796f8b")
    public static DataModelDiagram instantiate(final ClassDiagram obj) {
        return DataModelDiagram.canInstantiate(obj) ? new DataModelDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DataModelDiagram} proxy from a {@link ClassDiagram} stereotyped << DataModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ClassDiagram}
     * @return a {@link DataModelDiagram} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("bca7e860-948c-49a8-b9c3-64abc40360ba")
    public static DataModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (DataModelDiagram.canInstantiate(obj))
        	return new DataModelDiagram(obj);
        else
        	throw new IllegalArgumentException("DataModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e0e88157-910a-4668-81aa-719446a24f71")
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
        DataModelDiagram other = (DataModelDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ClassDiagram}. 
     * @return the ClassDiagram represented by this proxy, never null.
     */
    @objid ("0e00a595-0c02-4cb4-8499-c0719ed316f3")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("f42a1848-2d9f-46d0-a7a2-70c9918de826")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("13c6ee94-bae8-4378-89df-f30f295f1858")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("37c5a8e6-5ed9-4490-a94b-43eb15ed88d7")
    protected DataModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("2da9cb4c-8a06-4c65-8a65-2240141641c4")
    public static final class MdaTypes {
        @objid ("5ce83b81-9aff-42e8-9a0a-463f0f209501")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d315fafd-671c-4a2c-bced-f4c093a0f437")
        private static Stereotype MDAASSOCDEP;

        @objid ("67b026c0-b66a-41c2-92d9-3e2b3bce0656")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("eac93bb6-83c3-4ccb-ae4f-282730544672")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "fc779080-0243-43b7-a1e1-9ddf71de93d7");
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
