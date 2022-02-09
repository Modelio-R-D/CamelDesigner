/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/8/22 11:47 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.automatic.standard.staticdiagram;

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
import org.modelio.metamodel.diagrams.StaticDiagram;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link StaticDiagram} with << DataInstanceDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("905257df-ec00-46e6-b6c1-c65171728187")
public class DataInstanceDiagram {
    @objid ("ef16a276-70ce-4006-8ba0-118ebdc155ef")
    public static final String STEREOTYPE_NAME = "DataInstanceDiagram";

    /**
     * The underlying {@link StaticDiagram} represented by this proxy, never null.
     */
    @objid ("4f1fac12-d8fc-4ced-b528-d1dae5c257e1")
    protected final StaticDiagram elt;

    /**
     * Tells whether a {@link DataInstanceDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link StaticDiagram} stereotyped << DataInstanceDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("5dd117a4-94e2-4a93-adb6-7f88cbcfe813")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof StaticDiagram) && ((StaticDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataInstanceDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link StaticDiagram} stereotyped << DataInstanceDiagram >> then instantiate a {@link DataInstanceDiagram} proxy.
     * 
     * @return a {@link DataInstanceDiagram} proxy on the created {@link StaticDiagram}.
     */
    @objid ("43c10788-8442-47a9-9e7c-54a01ee7d08c")
    public static DataInstanceDiagram create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.StaticDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, DataInstanceDiagram.STEREOTYPE_NAME);
        return DataInstanceDiagram.instantiate((StaticDiagram)e);
    }

    /**
     * Tries to instantiate a {@link DataInstanceDiagram} proxy from a {@link StaticDiagram} stereotyped << DataInstanceDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a StaticDiagram
     * @return a {@link DataInstanceDiagram} proxy or <i>null</i>.
     */
    @objid ("1b5e4f96-d177-4c88-a7f6-a25a82477ee0")
    public static DataInstanceDiagram instantiate(final StaticDiagram obj) {
        return DataInstanceDiagram.canInstantiate(obj) ? new DataInstanceDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DataInstanceDiagram} proxy from a {@link StaticDiagram} stereotyped << DataInstanceDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link StaticDiagram}
     * @return a {@link DataInstanceDiagram} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b64b00ac-7e85-4433-9bca-15508bd04fac")
    public static DataInstanceDiagram safeInstantiate(final StaticDiagram obj) throws IllegalArgumentException {
        if (DataInstanceDiagram.canInstantiate(obj))
        	return new DataInstanceDiagram(obj);
        else
        	throw new IllegalArgumentException("DataInstanceDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("acb54441-7c6a-49ad-a79f-8d9defe376cd")
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
     * Get the underlying {@link StaticDiagram}. 
     * @return the StaticDiagram represented by this proxy, never null.
     */
    @objid ("dc49808c-74f2-4335-aca3-ee5963ea47f1")
    public StaticDiagram getElement() {
        return this.elt;
    }

    @objid ("0584e385-cf34-4864-89cd-d8ddaf480541")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("ee4010bd-d829-457b-84d3-13272fbd59ae")
    protected DataInstanceDiagram(final StaticDiagram elt) {
        this.elt = elt;
    }

    @objid ("8a0ebcca-96b9-4f46-b044-ab2d6e1d48b5")
    public static final class MdaTypes {
        @objid ("442f46c5-9a1e-4d9d-adf1-cfedb1638b3d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e7b60a6d-bd34-4fb8-a12b-0f2439f0a07e")
        private static Stereotype MDAASSOCDEP;

        @objid ("8d89f62d-236b-4fb3-81c8-e4119efe413a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a51b1834-1746-4dec-bfab-1aa515d6f894")
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
