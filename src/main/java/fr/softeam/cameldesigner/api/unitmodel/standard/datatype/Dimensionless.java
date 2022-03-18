/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 3/17/22 5:18 PM by Modelio Studio.
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
    @objid ("9956a190-21da-4550-b301-6f68ac585837")
    public static final String STEREOTYPE_NAME = "Dimensionless";

    /**
     * Tells whether a {@link Dimensionless proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << Dimensionless >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a827a102-a79b-4cb3-ab4b-ced5458eb0ac")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Dimensionless.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << Dimensionless >> then instantiate a {@link Dimensionless} proxy.
     * 
     * @return a {@link Dimensionless} proxy on the created {@link DataType}.
     */
    @objid ("19eb819b-27bd-4568-a137-e9bf263b59aa")
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
    @objid ("fb3d2388-b8d0-4304-91cd-597ff49309fe")
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
    @objid ("adc6b4c9-9047-4bca-b145-2c626f813c34")
    public static Dimensionless safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (Dimensionless.canInstantiate(obj))
        	return new Dimensionless(obj);
        else
        	throw new IllegalArgumentException("Dimensionless: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b1020d66-202a-4d62-a125-75b13d84c4b1")
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
    @objid ("aea28e32-5411-4a6c-8f90-566ebd3a4bff")
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    @objid ("b6ceb439-b601-4e95-b122-d1985a12c5f4")
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

    @objid ("81187505-ef85-4f14-ad7d-3a239ec0af03")
    protected Dimensionless(final DataType elt) {
        super(elt);
    }

    @objid ("1d70db3f-3af3-451e-8f06-2dfdde561927")
    public static final class MdaTypes {
        @objid ("6d65fcd9-7603-4fef-a3b4-68f6e2ad5357")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e9556097-7ac6-4c45-9bd8-0e68d9e798dd")
        private static Stereotype MDAASSOCDEP;

        @objid ("56da25f6-0b1e-4ee8-8d89-76485f3f3cbb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ab42ba85-6b10-4842-b62b-8f47f68c947f")
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
