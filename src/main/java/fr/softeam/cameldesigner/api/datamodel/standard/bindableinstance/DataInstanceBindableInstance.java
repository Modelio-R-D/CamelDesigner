/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.datamodel.standard.bindableinstance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.datamodel.standard.instance.DataInstance;
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
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link BindableInstance} with << DataInstance_BindableInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("f23e6d20-b54c-47fc-848b-1b0ab1c02666")
public class DataInstanceBindableInstance extends DataInstance {
    @objid ("ec308119-0e27-4355-9690-421bc6eb21b1")
    public static final String STEREOTYPE_NAME = "DataInstance_BindableInstance";

    /**
     * Tells whether a {@link DataInstanceBindableInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link BindableInstance} stereotyped << DataInstance_BindableInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("497a3201-0201-4846-9831-83eec38b62da")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof BindableInstance) && ((BindableInstance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataInstanceBindableInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link BindableInstance} stereotyped << DataInstance_BindableInstance >> then instantiate a {@link DataInstanceBindableInstance} proxy.
     * 
     * @return a {@link DataInstanceBindableInstance} proxy on the created {@link BindableInstance}.
     */
    @objid ("7f0e9d6c-ff0c-47cf-ac17-109db9a6c38a")
    public static DataInstanceBindableInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.BindableInstance");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, DataInstanceBindableInstance.STEREOTYPE_NAME);
        return DataInstanceBindableInstance.instantiate((BindableInstance)e);
    }

    /**
     * Tries to instantiate a {@link DataInstanceBindableInstance} proxy from a {@link BindableInstance} stereotyped << DataInstance_BindableInstance >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a BindableInstance
     * @return a {@link DataInstanceBindableInstance} proxy or <i>null</i>.
     */
    @objid ("a9d3c541-ecc6-42c9-a546-39df6057726d")
    public static DataInstanceBindableInstance instantiate(final BindableInstance obj) {
        return DataInstanceBindableInstance.canInstantiate(obj) ? new DataInstanceBindableInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DataInstanceBindableInstance} proxy from a {@link BindableInstance} stereotyped << DataInstance_BindableInstance >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link BindableInstance}
     * @return a {@link DataInstanceBindableInstance} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("8ea2be1b-401f-419c-bba2-59b3d3c9fc1c")
    public static DataInstanceBindableInstance safeInstantiate(final BindableInstance obj) throws IllegalArgumentException {
        if (DataInstanceBindableInstance.canInstantiate(obj))
            return new DataInstanceBindableInstance(obj);
        else
            throw new IllegalArgumentException("DataInstanceBindableInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("61667e1b-3257-477d-9fa6-a0d104f27b23")
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
        DataInstanceBindableInstance other = (DataInstanceBindableInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link BindableInstance}.
     * 
     * @return the BindableInstance represented by this proxy, never null.
     */
    @objid ("3f53f8b3-2525-4f59-b9f7-a0b9bd7a0025")
    @Override
    public BindableInstance getElement() {
        return (BindableInstance)super.getElement();
    }

    /**
     * Get the value to the 'owner' role.<p>
     * Role description:
     * null
     */
    @objid ("e1d6e732-0061-49bb-acaa-bf32bc32f744")
    public DataInstance getOwner() {
        return (DataInstance)CamelDesignerProxyFactory.instantiate(((BindableInstance) this.elt).getCluster(), DataInstance.STEREOTYPE_NAME);
    }

    @objid ("940f75a2-ec0a-4241-bf54-eae0a9194ac2")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'owner' role.<p>
     * Role description:
     * null
     */
    @objid ("cb22e1c7-ae37-460d-af21-796c8da81cce")
    public void setOwner(final DataInstance obj) {
        ((BindableInstance) this.elt).setCluster((obj != null) ? obj.getElement() : null);
    }

    @objid ("261564c5-66d9-4bdb-85b2-7e8f0e8d5081")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("42eb5aaf-992c-484c-933e-61142a2b80ec")
    protected DataInstanceBindableInstance(final BindableInstance elt) {
        super(elt);
    }

    @objid ("a85bfe4a-348a-47dc-afe9-847afd7550b8")
    public static final class MdaTypes {
        @objid ("35e5aef4-a6ae-4019-8e0b-d35ff46876d3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("fdb74b6e-737e-4301-bfd8-067a10c7ed5b")
        private static Stereotype MDAASSOCDEP;

        @objid ("f91ca2f3-a0b7-47bf-9083-7d94f6e3f07f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d69b08db-c732-4c07-80bd-d041a13319d1")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ca031a70-7376-4397-ae2a-7ff762e285e1");
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
