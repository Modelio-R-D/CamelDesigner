/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
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
    @objid ("343dd261-a7e0-4988-b3ac-9dd6703b90f9")
    public static final String STEREOTYPE_NAME = "Dimensionless";

    /**
     * Tells whether a {@link Dimensionless proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << Dimensionless >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("034c6d99-6b98-4691-88ff-e1e91b9a27a0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Dimensionless.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << Dimensionless >> then instantiate a {@link Dimensionless} proxy.
     * 
     * @return a {@link Dimensionless} proxy on the created {@link DataType}.
     */
    @objid ("ffb52062-25ae-471f-8aa4-e7fb9dcad818")
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
    @objid ("7b5c732e-5474-4faf-8d66-4d2f5e4aba47")
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
    @objid ("b56ccbe3-107a-44d9-8d62-af5cc69dc81c")
    public static Dimensionless safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (Dimensionless.canInstantiate(obj))
        	return new Dimensionless(obj);
        else
        	throw new IllegalArgumentException("Dimensionless: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a36a6438-74c7-4777-af79-76aee5caf16b")
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
    @objid ("c8af67c6-e935-4e8f-97fa-aeddf9eff26e")
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    @objid ("f2ddaa01-cbb3-423f-939c-d73c540572d3")
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

    @objid ("3dbc6e75-6088-4252-a18b-2fb41595d1d0")
    protected Dimensionless(final DataType elt) {
        super(elt);
    }

    @objid ("1d70db3f-3af3-451e-8f06-2dfdde561927")
    public static final class MdaTypes {
        @objid ("efa54a93-42fe-4bf6-8fa3-115db31eaa07")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("75fc7db5-e516-4ae6-bf0d-a77ca084b157")
        private static Stereotype MDAASSOCDEP;

        @objid ("5906d4cf-9744-446d-8326-5d11a765fc53")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("74ac50a2-af5b-483e-bfa5-a8310e424ddf")
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
