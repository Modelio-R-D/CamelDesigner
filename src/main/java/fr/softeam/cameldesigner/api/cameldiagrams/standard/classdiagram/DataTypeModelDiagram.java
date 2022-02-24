/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/23/22 5:02 PM by Modelio Studio.
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
 * Proxy class to handle a {@link ClassDiagram} with << DataTypeModelDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("05f54bfd-dbfd-4864-835a-f9d72e6569b8")
public class DataTypeModelDiagram extends AbstractCamelDiagram {
    @objid ("51537a1f-ef92-4e8f-833e-f91178bdcd27")
    public static final String STEREOTYPE_NAME = "DataTypeModelDiagram";

    /**
     * Tells whether a {@link DataTypeModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << DataTypeModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9b65fbd3-e749-4acb-a66b-ba3f31600827")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataTypeModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << DataTypeModelDiagram >> then instantiate a {@link DataTypeModelDiagram} proxy.
     * 
     * @return a {@link DataTypeModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("d8cb1261-73b6-427a-9b8a-ea1b9182b366")
    public static DataTypeModelDiagram create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, DataTypeModelDiagram.STEREOTYPE_NAME);
        return DataTypeModelDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link DataTypeModelDiagram} proxy from a {@link ClassDiagram} stereotyped << DataTypeModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ClassDiagram
     * @return a {@link DataTypeModelDiagram} proxy or <i>null</i>.
     */
    @objid ("d6cd3265-6948-4942-b84f-2943c447a81a")
    public static DataTypeModelDiagram instantiate(final ClassDiagram obj) {
        return DataTypeModelDiagram.canInstantiate(obj) ? new DataTypeModelDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DataTypeModelDiagram} proxy from a {@link ClassDiagram} stereotyped << DataTypeModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ClassDiagram}
     * @return a {@link DataTypeModelDiagram} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("cd023ab9-13a6-4400-a551-aac8b5dae332")
    public static DataTypeModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (DataTypeModelDiagram.canInstantiate(obj))
        	return new DataTypeModelDiagram(obj);
        else
        	throw new IllegalArgumentException("DataTypeModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("354e4605-6f2a-4047-a879-66abd16779a6")
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
        DataTypeModelDiagram other = (DataTypeModelDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ClassDiagram}. 
     * @return the ClassDiagram represented by this proxy, never null.
     */
    @objid ("3e3f07b6-832b-4187-879b-67c7e2f01e20")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("e207dc73-8f14-4964-8140-1b88571d54e8")
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

    @objid ("e303f8fa-0c3a-4ee3-84b7-0f15d2df3a78")
    protected DataTypeModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("2da9cb4c-8a06-4c65-8a65-2240141641c4")
    public static final class MdaTypes {
        @objid ("ba8e72ee-cc84-4ea4-8941-572e468835dd")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("91d3cfd9-3daa-4277-b9b6-dcf9c79b6dd7")
        private static Stereotype MDAASSOCDEP;

        @objid ("f90c7149-29b4-4c3d-9089-740a23ac1f81")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("28f5569f-89c7-47d8-9ba9-29a42a4842f8")
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
