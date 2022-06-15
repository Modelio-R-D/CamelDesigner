/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.10

 * This file was generated on 4/27/22 11:51 AM by Modelio Studio.
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
 * Proxy class to handle a {@link DataType} with << SingleUnit >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("7dfc6119-7128-437f-995f-47f0c2960c89")
public class SingleUnit extends DimensionedUnit {
    @objid ("1ae4c53b-0795-41db-a9dd-3434a87e5f6d")
    public static final String STEREOTYPE_NAME = "SingleUnit";

    /**
     * Tells whether a {@link SingleUnit proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << SingleUnit >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("6f67175a-3877-411d-8c57-6f720adfcae7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SingleUnit.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << SingleUnit >> then instantiate a {@link SingleUnit} proxy.
     * 
     * @return a {@link SingleUnit} proxy on the created {@link DataType}.
     */
    @objid ("1baa0ddc-2e32-4e33-8d2a-2eba4ce4e917")
    public static SingleUnit create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.DataType");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, SingleUnit.STEREOTYPE_NAME);
        return SingleUnit.instantiate((DataType)e);
    }

    /**
     * Tries to instantiate a {@link SingleUnit} proxy from a {@link DataType} stereotyped << SingleUnit >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a DataType
     * @return a {@link SingleUnit} proxy or <i>null</i>.
     */
    @objid ("feda5a3d-8806-488a-8973-72f4bc21794b")
    public static SingleUnit instantiate(final DataType obj) {
        return SingleUnit.canInstantiate(obj) ? new SingleUnit(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SingleUnit} proxy from a {@link DataType} stereotyped << SingleUnit >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link DataType}
     * @return a {@link SingleUnit} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("abdf644a-0143-4f7d-b62d-20d3ac413195")
    public static SingleUnit safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (SingleUnit.canInstantiate(obj))
            return new SingleUnit(obj);
        else
            throw new IllegalArgumentException("SingleUnit: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8768357e-f8d6-47ee-9ab0-6869078821db")
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
        SingleUnit other = (SingleUnit) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link DataType}.
     * 
     * @return the DataType represented by this proxy, never null.
     */
    @objid ("8f55dee3-31b4-4b4d-88bb-f7000308faf1")
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    @objid ("de528291-71fc-4e06-8b32-ab750b304fa0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("d4eddff9-2c8e-44f5-a3b8-4b8052eb067a")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("1fb7f85d-d7a2-4b00-87f7-869b4525b92a")
    protected SingleUnit(final DataType elt) {
        super(elt);
    }

    @objid ("41eab5b5-d30f-43d2-9da2-943d64381732")
    public static final class MdaTypes {
        @objid ("489d7865-2030-4e26-a206-0e1dd585d6e6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2d087221-0e68-4d57-ac8a-4257b6d8f4c4")
        private static Stereotype MDAASSOCDEP;

        @objid ("32b0802e-0985-4ee7-bdf9-872b3a7d46cb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b6cfd1c9-f73f-47b7-92a7-1547a2e50f46")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "5f6c0584-c6dd-44e5-a1ad-cd4785dccb03");
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
