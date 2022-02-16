/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/16/22 10:46 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.unitmodel.standard.datatype;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link DataType} with << Dimensionless >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("e9f9cd86-0e87-4d30-8dca-05407bf4faee")
public class Dimensionless extends Unit {
    @objid ("e88f20c5-c3e8-43a0-9676-92c2f2c2f960")
    public static final String STEREOTYPE_NAME = "Dimensionless";

    /**
     * Tells whether a {@link Dimensionless proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << Dimensionless >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("1a768671-d369-419c-9bdf-c9d950db9b49")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Dimensionless.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << Dimensionless >> then instantiate a {@link Dimensionless} proxy.
     * 
     * @return a {@link Dimensionless} proxy on the created {@link DataType}.
     */
    @objid ("3de7f8f0-bb5e-488c-9a23-9d7d5bd179c0")
    public static Dimensionless create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.DataType");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Dimensionless.STEREOTYPE_NAME);
        return Dimensionless.instantiate((DataType)e);
    }

    /**
     * Tries to instantiate a {@link Dimensionless} proxy from a {@link DataType} stereotyped << Dimensionless >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a DataType
     * @return a {@link Dimensionless} proxy or <i>null</i>.
     */
    @objid ("cf5776e2-6333-48cf-8078-07394c27ff77")
    public static Dimensionless instantiate(final DataType obj) {
        return Dimensionless.canInstantiate(obj) ? new Dimensionless(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Dimensionless} proxy from a {@link DataType} stereotyped << Dimensionless >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link DataType}
     * @return a {@link Dimensionless} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("bb5021cf-fdca-46d4-8711-ca423012b738")
    public static Dimensionless safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (Dimensionless.canInstantiate(obj))
        	return new Dimensionless(obj);
        else
        	throw new IllegalArgumentException("Dimensionless: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8a21abfe-3db2-46bb-ac1a-433894766e90")
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
        Dimensionless other = (Dimensionless) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link DataType}. 
     * @return the DataType represented by this proxy, never null.
     */
    @objid ("bdd0698b-b31e-482a-afa5-e52441429213")
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    @objid ("c067bef8-dad1-4d8b-a82a-b0bc9dbbc3ab")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("6672b81b-cfe8-4e1b-9360-dffd714df46a")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("60a6e8f6-bdc8-4e11-bfa6-12072dd0f47c")
    protected Dimensionless(final DataType elt) {
        super(elt);
    }

    @objid ("1d70db3f-3af3-451e-8f06-2dfdde561927")
    public static final class MdaTypes {
        @objid ("7a12badf-e21a-4cbb-ad22-258fc2f144aa")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6b2f9546-6d83-4c2d-8940-f75d1fa7a38d")
        private static Stereotype MDAASSOCDEP;

        @objid ("3efc608f-a125-4a33-9e96-1fb9bc8a6c18")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("14397005-39ee-4ffd-92c4-6e327fc73725")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "4d98d5de-9085-4175-b509-30f88171f3ea");
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
