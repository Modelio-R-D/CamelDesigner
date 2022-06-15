/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.10

 * This file was generated on 4/27/22 11:51 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.constraintmodel.standard.package_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.SubModel;
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
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Package} with << ConstraintModel >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("86cc342f-3138-45c5-9f57-831a1ef207ca")
public class ConstraintModel extends SubModel {
    @objid ("1ef92b92-0b43-4d8f-93fa-ac98b0fa547b")
    public static final String STEREOTYPE_NAME = "ConstraintModel";

    /**
     * Tells whether a {@link ConstraintModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << ConstraintModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("fb1e499e-2e4d-454f-8179-4c9eee2acd49")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ConstraintModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << ConstraintModel >> then instantiate a {@link ConstraintModel} proxy.
     * 
     * @return a {@link ConstraintModel} proxy on the created {@link Package}.
     */
    @objid ("fb578f85-01cd-45dd-8a31-7614fd3ee191")
    public static ConstraintModel create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Package");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ConstraintModel.STEREOTYPE_NAME);
        return ConstraintModel.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link ConstraintModel} proxy from a {@link Package} stereotyped << ConstraintModel >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Package
     * @return a {@link ConstraintModel} proxy or <i>null</i>.
     */
    @objid ("076a8d57-5423-479e-af97-9f22d9181dbe")
    public static ConstraintModel instantiate(final Package obj) {
        return ConstraintModel.canInstantiate(obj) ? new ConstraintModel(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ConstraintModel} proxy from a {@link Package} stereotyped << ConstraintModel >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Package}
     * @return a {@link ConstraintModel} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("65be398d-4ad1-4eb9-92c0-2fc7a58b5a29")
    public static ConstraintModel safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (ConstraintModel.canInstantiate(obj))
            return new ConstraintModel(obj);
        else
            throw new IllegalArgumentException("ConstraintModel: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b1fd0d57-d55e-4d0d-a9bb-2c2d318b6e02")
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
        ConstraintModel other = (ConstraintModel) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Package}.
     * 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("7ad26398-11a6-42e4-ad8a-350b1a9bba02")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    @objid ("6fc75e22-4ee4-4f94-b635-f00c9a528214")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("9025f90d-62ce-4bbe-bd7b-0fd4343e9ec5")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("f2fa0855-a249-40c7-8886-bf73b6320190")
    protected ConstraintModel(final Package elt) {
        super(elt);
    }

    @objid ("ebe267b3-9ebc-4287-8f57-7be02738f119")
    public static final class MdaTypes {
        @objid ("4e291b98-a2c8-4744-ad89-fcf8c214c6e4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("334becfa-dec2-4e8b-b36a-10c9cd845917")
        private static Stereotype MDAASSOCDEP;

        @objid ("9e7e889a-4dba-4b47-b85e-a439ba376ef9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6c3f1306-a514-403c-b4d0-c2310f4bb009")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0a13db20-02d0-45a2-954a-db10f14d206b");
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
