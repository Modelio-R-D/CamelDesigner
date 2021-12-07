/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
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
    @objid ("b343a584-f891-4127-a33b-3a888ce2a0f3")
    public static final String STEREOTYPE_NAME = "UnitDimension";

    /**
     * Tells whether a {@link UnitDimension proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << UnitDimension >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("11dd65ac-f70b-4645-bc8a-f6cfa1dc92ef")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, UnitDimension.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << UnitDimension >> then instantiate a {@link UnitDimension} proxy.
     * 
     * @return a {@link UnitDimension} proxy on the created {@link DataType}.
     */
    @objid ("84905ac9-a286-4b21-9858-54b06ddfb5f9")
    public static UnitDimension create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.DataType");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, UnitDimension.STEREOTYPE_NAME);
        return UnitDimension.instantiate((DataType)e);
    }

    /**
     * Tries to instantiate a {@link UnitDimension} proxy from a {@link DataType} stereotyped << UnitDimension >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a DataType
     * @return a {@link UnitDimension} proxy or <i>null</i>.
     */
    @objid ("009dcfd3-2ff1-4a3f-9970-316bdb71cea5")
    public static UnitDimension instantiate(final DataType obj) {
        return UnitDimension.canInstantiate(obj) ? new UnitDimension(obj) : null;
    }

    /**
     * Tries to instantiate a {@link UnitDimension} proxy from a {@link DataType} stereotyped << UnitDimension >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link DataType}
     * @return a {@link UnitDimension} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("2898ff8c-3763-4856-b7c7-a86cca131470")
    public static UnitDimension safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (UnitDimension.canInstantiate(obj))
            return new UnitDimension(obj);
        else
            throw new IllegalArgumentException("UnitDimension: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("51e6f51b-e9b1-4ba4-8d59-e35b60622a87")
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
     * 
     * @return the DataType represented by this proxy, never null.
     */
    @objid ("c2750b2f-fc31-4b23-90f0-78799d915416")
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    @objid ("e0a1d91c-4bc0-441b-ba18-2c4539759200")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("df37716d-dc6e-4b34-86db-627c76c6e4fb")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("5a6e0bb8-1019-4767-b22b-cdb82601000e")
    protected UnitDimension(final DataType elt) {
        super(elt);
    }

    @objid ("75da9eb1-b40f-49c3-9600-695ba46ea42f")
    public static final class MdaTypes {
        @objid ("44680424-8916-4d3c-857d-4ce6c0b4c2ff")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("716ecf3a-4937-4d11-9fd1-3d884e7e4ff5")
        private static Stereotype MDAASSOCDEP;

        @objid ("00736b9a-f6df-45bd-a6b4-e229ec45a044")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5709a864-465e-4acb-ab92-a2a974a75ce0")
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
