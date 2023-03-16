/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
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
    @objid ("d590c139-1a7d-4acb-b8c9-3836dd85d640")
    public static final String STEREOTYPE_NAME = "DataTypeModelDiagram";

    /**
     * Tells whether a {@link DataTypeModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << DataTypeModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("522d06e6-e63a-4db8-94a7-71d60ab11b44")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataTypeModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << DataTypeModelDiagram >> then instantiate a {@link DataTypeModelDiagram} proxy.
     * 
     * @return a {@link DataTypeModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("db07c7d4-20b4-45ab-bcf4-fdc502d31b26")
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
    @objid ("244e1dae-9308-4161-b7f4-8ff2f23051ec")
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
    @objid ("e07dfd26-fba3-49d6-aa82-63a2fa2e9c4d")
    public static DataTypeModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (DataTypeModelDiagram.canInstantiate(obj))
        	return new DataTypeModelDiagram(obj);
        else
        	throw new IllegalArgumentException("DataTypeModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b4a90cbe-1c79-473c-9d0d-198fbc6feff0")
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
    @objid ("8815bcf8-aacc-49bb-a011-96c32034e2f3")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("ce54a954-d11c-4390-a2b6-843add459220")
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

    @objid ("9d6139be-744e-4aed-bfd7-e5a073d15a73")
    protected DataTypeModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("2da9cb4c-8a06-4c65-8a65-2240141641c4")
    public static final class MdaTypes {
        @objid ("5b966c20-49a2-48a0-864d-9317e04c1921")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("43c40a9c-cb1d-4d1e-ae46-cd1373d057df")
        private static Stereotype MDAASSOCDEP;

        @objid ("bd094eaa-17aa-490b-a2e9-c616a8e195fb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f6ee4778-46ce-46c4-b940-afded8603179")
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
