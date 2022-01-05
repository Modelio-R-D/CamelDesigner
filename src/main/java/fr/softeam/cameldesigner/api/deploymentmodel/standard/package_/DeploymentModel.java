/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentmodel.standard.package_;

import java.util.List;
<<<<<<< HEAD
=======
import java.util.Objects;
>>>>>>> e429ba8cf675faca5e300c08c52247687d794213
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.SubModel;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
<<<<<<< HEAD
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
=======
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
>>>>>>> e429ba8cf675faca5e300c08c52247687d794213
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Package} with << DeploymentModel >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("6e4c7b4b-d381-4e52-a43d-fcb0cea6173f")
public class DeploymentModel extends SubModel {
    @objid ("07b234e6-fc6d-4252-942e-fa80bf89a24b")
    public static final String STEREOTYPE_NAME = "DeploymentModel";

    /**
     * Tells whether a {@link DeploymentModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << DeploymentModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("7d3d67ce-42fb-46d1-8a75-1a21b536879c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DeploymentModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << DeploymentModel >> then instantiate a {@link DeploymentModel} proxy.
     * 
     * @return a {@link DeploymentModel} proxy on the created {@link Package}.
     */
    @objid ("9ec44df7-7780-4bac-b4f5-30bd6236cdc0")
    public static DeploymentModel create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Package");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, DeploymentModel.STEREOTYPE_NAME);
        return DeploymentModel.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link DeploymentModel} proxy from a {@link Package} stereotyped << DeploymentModel >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Package
     * @return a {@link DeploymentModel} proxy or <i>null</i>.
     */
    @objid ("45544a6e-5b30-4872-b3d8-d32b8b9b2fc1")
    public static DeploymentModel instantiate(final Package obj) {
        return DeploymentModel.canInstantiate(obj) ? new DeploymentModel(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DeploymentModel} proxy from a {@link Package} stereotyped << DeploymentModel >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Package}
     * @return a {@link DeploymentModel} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("a53f579a-4803-4111-9e66-f34ad39160e1")
    public static DeploymentModel safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (DeploymentModel.canInstantiate(obj))
            return new DeploymentModel(obj);
        else
            throw new IllegalArgumentException("DeploymentModel: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c5a20d2c-df9c-4f7f-8936-b37e916b9e9a")
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
        DeploymentModel other = (DeploymentModel) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value to the 'camelModel' role.<p>
     * Role description:
     * null
     */
    @objid ("c13b3c7d-d95e-4ccb-820e-160bcf6841fe")
    public CamelModel getCamelModel() {
        return (CamelModel)CamelDesignerProxyFactory.instantiate(((Package) this.elt).getOwner(), CamelModel.STEREOTYPE_NAME);
    }

    /**
     * Get the underlying {@link Package}.
     * 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("4d7de8e1-572e-42e0-91d0-cf1025f87efc")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    @objid ("cb66d083-db00-43a7-9ef7-ef03892d3a9e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'camelModel' role.<p>
     * Role description:
     * null
     */
    @objid ("3800a8e1-e873-4b2a-b6ee-6e1a390d25f0")
    public void setCamelModel(final CamelModel obj) {
        ((Package) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    @objid ("08c52df8-dbb1-4743-8e10-cee09f72507e")
    @Override
    public List<CamelElement> getChilds() {
<<<<<<< HEAD
        return super.getChilds();
    }

    @objid ("ad667ad5-9278-4595-bc30-dffedf0b3ad8")
    protected DeploymentModel(final Package elt) {
        super(elt);
    }

    @objid ("bcfd6f5c-46e7-47aa-9a4b-79a22339b9f4")
    public static final class MdaTypes {
        @objid ("ae36dcd0-7fab-4442-94b1-b8edc0d2a8e7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d7667c51-c15a-4073-8e4a-2c7d4ab016b1")
        private static Stereotype MDAASSOCDEP;

        @objid ("fdcfd7a8-d947-414c-b670-870793621901")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0146236e-ca4a-4eb8-a74d-b16c22d5891f")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "7d620068-3fc6-4fec-8829-0444c0c3186f");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


static {
        if(CamelDesignerModule.getInstance() != null) {
            init(CamelDesignerModule.getInstance().getModuleContext());
        }
    }
    }

=======
        List<CamelElement> result = new ArrayList<>();
        result.addAll(getSoftwareComponents());
        result.addAll(getVMs());
        result.addAll(getPaases());
        result.addAll(getContainers());
        result.addAll(getRequirementSets());
        return result;
    }

    @objid ("ad667ad5-9278-4595-bc30-dffedf0b3ad8")
    protected DeploymentModel(final Package elt) {
        super(elt);
    }

    @objid ("cf8f5992-a07c-4f61-98e6-68278a5f38fb")
    private Collection<? extends CamelElement> getContainers() {
        // TODO Auto-generated method stub
        return null;
    }

    @objid ("2e7178f0-ca7b-4f97-bed1-99441d94433e")
    private Collection<? extends CamelElement> getPaases() {
        // TODO Auto-generated method stub
        return null;
    }

    @objid ("1fb8c136-e7b2-4bbb-a01e-9a9769f7c748")
    private Collection<? extends CamelElement> getRequirementSets() {
        // TODO Auto-generated method stub
        return null;
    }

    @objid ("69d8be33-20c0-4544-b649-b78e66ddb473")
    private Collection<? extends CamelElement> getSoftwareComponents() {
        // TODO Auto-generated method stub
        return null;
    }

    @objid ("c74d9c27-f267-49ef-a868-98d61f7b32db")
    private Collection<? extends CamelElement> getVMs() {
        // TODO Auto-generated method stub
        return null;
    }

    @objid ("bcfd6f5c-46e7-47aa-9a4b-79a22339b9f4")
    public static final class MdaTypes {
        @objid ("ae36dcd0-7fab-4442-94b1-b8edc0d2a8e7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d7667c51-c15a-4073-8e4a-2c7d4ab016b1")
        private static Stereotype MDAASSOCDEP;

        @objid ("fdcfd7a8-d947-414c-b670-870793621901")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0146236e-ca4a-4eb8-a74d-b16c22d5891f")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "7d620068-3fc6-4fec-8829-0444c0c3186f");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


static {
        if(CamelDesignerModule.getInstance() != null) {
            init(CamelDesignerModule.getInstance().getModuleContext());
        }
    }
    }

>>>>>>> e429ba8cf675faca5e300c08c52247687d794213
}
