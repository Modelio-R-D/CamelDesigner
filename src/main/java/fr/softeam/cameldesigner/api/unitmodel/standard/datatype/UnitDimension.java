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
import fr.softeam.cameldesigner.api.camelcore.standard.datatype.FeatureDataType;
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
 * Proxy class to handle a {@link DataType} with << UnitDimension >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("1707f141-4e9c-4725-b618-05f025f22d01")
public class UnitDimension extends FeatureDataType {
    @objid ("0d17ee62-e31f-48d0-a89b-f9b67793c0c8")
    public static final String STEREOTYPE_NAME = "UnitDimension";

    /**
     * Tells whether a {@link UnitDimension proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << UnitDimension >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("17f5c997-2d1c-4bee-a68b-36739952179e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, UnitDimension.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << UnitDimension >> then instantiate a {@link UnitDimension} proxy.
     * 
     * @return a {@link UnitDimension} proxy on the created {@link DataType}.
     */
    @objid ("58b8c5b7-4383-4415-8b21-d201dacc8c87")
    public static UnitDimension create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.DataType");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, UnitDimension.STEREOTYPE_NAME);
        return UnitDimension.instantiate((DataType)e);
    }

    /**
     * Tries to instantiate a {@link UnitDimension} proxy from a {@link DataType} stereotyped << UnitDimension >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a DataType
     * @return a {@link UnitDimension} proxy or <i>null</i>.
     */
    @objid ("904add3f-b6d4-4183-9e13-87eac02b517a")
    public static UnitDimension instantiate(final DataType obj) {
        return UnitDimension.canInstantiate(obj) ? new UnitDimension(obj) : null;
    }

    /**
     * Tries to instantiate a {@link UnitDimension} proxy from a {@link DataType} stereotyped << UnitDimension >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link DataType}
     * @return a {@link UnitDimension} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c882d2fb-8f66-4a87-9cb2-b1827379ecb2")
    public static UnitDimension safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (UnitDimension.canInstantiate(obj))
        	return new UnitDimension(obj);
        else
        	throw new IllegalArgumentException("UnitDimension: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("9314ef8d-7724-4055-86cb-c5a2eb206ff1")
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
        UnitDimension other = (UnitDimension) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link DataType}. 
     * @return the DataType represented by this proxy, never null.
     */
    @objid ("04a467ba-2987-4487-8582-415cc65a5566")
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    @objid ("1c82be9e-94bf-44f6-b328-dff39529b83c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("404a3d74-e6ec-4fb4-b209-6e8bc5e16ad1")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("22e6c3e5-8f46-4d78-8a83-c5bc3df00358")
    protected UnitDimension(final DataType elt) {
        super(elt);
    }

    @objid ("75da9eb1-b40f-49c3-9600-695ba46ea42f")
    public static final class MdaTypes {
        @objid ("5f8f9e5a-a7be-48ff-b640-4cd5f080d7ed")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6bc6f723-014c-4d6e-95a2-3199423a4406")
        private static Stereotype MDAASSOCDEP;

        @objid ("070853f1-8085-455a-811b-45e20045dc30")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ec2ca839-1419-403f-8813-4d6a1e9fb563")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ce437f2d-07f2-4127-9702-da4eb627b157");
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
