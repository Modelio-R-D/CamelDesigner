/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 12/8/21 5:48 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.automatic.standard.classdiagram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
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
 * Proxy class to handle a {@link ClassDiagram} with << DataInstanceDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("463a97cf-273b-4806-b9e8-c4c686574eb5")
public class DataInstanceDiagram {
    @objid ("ca4678f7-b279-4389-b0e0-b00bbc89362f")
    public static final String STEREOTYPE_NAME = "DataInstanceDiagram";

    /**
     * The underlying {@link ClassDiagram} represented by this proxy, never null.
     */
    @objid ("9abaa307-199c-4fc7-ae4f-94ce20fef5e9")
    protected final ClassDiagram elt;

    /**
     * Tells whether a {@link DataInstanceDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << DataInstanceDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ede55b6d-a318-405e-b9a0-5f3810e65359")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataInstanceDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << DataInstanceDiagram >> then instantiate a {@link DataInstanceDiagram} proxy.
     * 
     * @return a {@link DataInstanceDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("3b739a2d-cc85-4610-9cdc-0586ceb46e28")
    public static DataInstanceDiagram create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, DataInstanceDiagram.STEREOTYPE_NAME);
        return DataInstanceDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link DataInstanceDiagram} proxy from a {@link ClassDiagram} stereotyped << DataInstanceDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ClassDiagram
     * @return a {@link DataInstanceDiagram} proxy or <i>null</i>.
     */
    @objid ("1360507c-ef18-4be1-a59d-61628bae7dff")
    public static DataInstanceDiagram instantiate(final ClassDiagram obj) {
        return DataInstanceDiagram.canInstantiate(obj) ? new DataInstanceDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DataInstanceDiagram} proxy from a {@link ClassDiagram} stereotyped << DataInstanceDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ClassDiagram}
     * @return a {@link DataInstanceDiagram} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("59ee7db6-936f-4bd6-a75d-63c40cdd3a69")
    public static DataInstanceDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (DataInstanceDiagram.canInstantiate(obj))
        	return new DataInstanceDiagram(obj);
        else
        	throw new IllegalArgumentException("DataInstanceDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7f1d0c98-a813-46d9-b1ff-ae8e1d9895e5")
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
        DataInstanceDiagram other = (DataInstanceDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ClassDiagram}. 
     * @return the ClassDiagram represented by this proxy, never null.
     */
    @objid ("4c8120ae-63a9-46c5-8bba-a3666a9b0bdc")
    public ClassDiagram getElement() {
        return this.elt;
    }

    @objid ("c2e60d6a-7f7d-4a67-bcd1-e5d1080d8cc0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("4301c45f-8c4d-4acf-a3e9-127f295401ba")
    protected DataInstanceDiagram(final ClassDiagram elt) {
        this.elt = elt;
    }

    @objid ("32b6b80e-39df-41b4-aac2-b08fbe9e10f8")
    public static final class MdaTypes {
        @objid ("b644999c-762e-48c4-8482-577bc6ec4475")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("751e9eb0-d60e-4ede-88ea-868d38ef52b7")
        private static Stereotype MDAASSOCDEP;

        @objid ("83910dd9-bfe2-4ccd-bc6a-3c1a755eb002")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a2cb9483-dd80-4986-af7d-3dd37ba28b1c")
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
